package com.pansky.order.controller;

import com.pansky.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private ProductService productService;

    @GetMapping("/{id:\\d+}")
    public Object getOrder(@PathVariable Integer id) {
        return productService.getProductByid(id);
    }

    @GetMapping("/xx")
    public Object getFastOrder(){
        return "调用成功";
    }
}
