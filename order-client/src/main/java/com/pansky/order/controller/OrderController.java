package com.pansky.order.controller;

import com.pansky.order.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 订单控制器
 *
 * @author Xue-Pan
 * @date 2020/2/18
 */
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id:\\d+}")
    public Object getOrder(@PathVariable Integer id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("product-server");
        ServiceInstance serviceInstance = instances.get(0);
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        return restTemplate.getForObject("http://"+host + ":" + port+"/product/"+id, Product.class);
    }
}
