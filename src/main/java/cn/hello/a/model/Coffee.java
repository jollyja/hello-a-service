package cn.hello.a.model;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Coffee {

    private String coffeeName;
    private BigDecimal coffeePrice;

}
