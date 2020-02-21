package com.pansky.product.controller;

import com.pansky.product.entity.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产品controller
 *
 * @author Xue-Pan
 * @date 2020/2/17
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @GetMapping("/{id}")
    public Product getPrduct(@PathVariable Integer id){
        Product product = null;
        if(id == 1){
            product = new Product();
            product.setName("调用ip"+ip+",端口-"+port);
            product.setPrice("50元");
            product.setId(1);
        }
        return product;
    }
}
