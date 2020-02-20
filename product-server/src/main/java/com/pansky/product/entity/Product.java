package com.pansky.product.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 产品实体类
 *
 * @author Xue-Pan
 * @date 2020/2/17
 */
@Data
@ToString
public class Product {

    private Integer id;
    private String name;
    private String price;
}
