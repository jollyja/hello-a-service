package cn.hello.a.controller;

import cn.hello.a.model.Coffee;
import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@RefreshScope
public class AController {

    @Value("${whoami:unkonwn}")
    private String whoami;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(path = "/a/start")
    public Map<String, String> start(@RequestBody Map<String, String> req) throws NacosException {
        Map<String, String> res = new HashMap<>();
        res.put("abc", "def");
        res.put("whoami", whoami);
        System.out.println("who am I : " + whoami);

        discoveryClient.getInstances("hello-b").forEach(serviceInstance -> {
            log.info("ServiceId : {}, InstanceId : {}, Host : {}, Port : {}", serviceInstance.getServiceId(), serviceInstance.getInstanceId(), serviceInstance.getHost(), serviceInstance.getPort());
        });

        Map<String, String> resFromB = restTemplate.postForObject(UriComponentsBuilder.fromUriString("http://hello-b/b/tryme").build().toUri(), res, Map.class);
        System.out.println(resFromB);

        Coffee cofee = Coffee.builder().coffeeName("espresso").coffeePrice(BigDecimal.TEN).build();

        log.info("this is lombok log!");

        return resFromB;
    }
}
