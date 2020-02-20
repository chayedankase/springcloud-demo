package com.pansky.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 *
 * @author Xue-Pan
 * @date 2020/2/18
 */
@Configuration
public class OrderConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
