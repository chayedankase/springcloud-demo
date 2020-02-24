package com.pansky.order.service;

import com.pansky.order.entity.Product;
import com.pansky.order.service.impl.ProductServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 产品服务接口
 *
 * @author Xue-Pan
 * @date 2020/2/21
 */
@FeignClient(name = "product-server",fallback = ProductServiceImpl.class)
public interface ProductService {

    /**
     * 根据id查询商品
     * @param id 商品id
     * @return 商品对象
     */
    @GetMapping("/product/{id}")
    Product getProductByid(@PathVariable Integer id);
}
