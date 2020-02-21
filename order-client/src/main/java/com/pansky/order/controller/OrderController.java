package com.pansky.order.controller;

import com.pansky.order.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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


    @GetMapping("/{id:\\d+}")
    public Object getOrder(@PathVariable Integer id) {
        return restTemplate.getForObject("http://product-server/product/"+id, Product.class);
    }
}
