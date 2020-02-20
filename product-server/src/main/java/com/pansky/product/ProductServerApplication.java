package com.pansky.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 产品服务启动类
 *
 * @author Xue-Pan
 * @date 2020/2/17
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServerApplication.class, args);
    }
}
