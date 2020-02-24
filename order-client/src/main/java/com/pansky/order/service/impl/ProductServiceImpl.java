package com.pansky.order.service.impl;

import com.pansky.order.entity.Product;
import com.pansky.order.service.ProductService;
import org.springframework.stereotype.Component;

/**
 * 产品服务的熔断降级调用实现类
 *
 * @author Xue-Pan
 * @date 2020/2/22
 */
@Component
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProductByid(Integer id) {
        Product product = new Product();
        product.setName("调用了熔断降级方法");
        return product;
    }
}
