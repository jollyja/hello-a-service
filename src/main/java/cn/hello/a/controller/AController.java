package cn.hello.a.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AController {

    @PostMapping(path = "/a/start")
    public Map<String, String> done(@RequestBody Map<String, String> req) {
        Map<String, String> res = new HashMap<>();
        res.put(null, "1");
        res.put("abc", "def");
        return res;
    }



}
