package com.imooc.manager.controller;

import com.imooc.entity.Product;
import com.imooc.manager.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static Logger LOG= LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService service;

    @RequestMapping(value="",method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product){
        LOG.info("创建产品，参数{}",product);
        Product result =service.addProduct(product);
        LOG.info("创建产品,结果:{}",result);
        return result;
    }

}
