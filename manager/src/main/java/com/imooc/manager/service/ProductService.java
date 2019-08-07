package com.imooc.manager.service;


import com.imooc.entity.Product;
import com.imooc.entity.enums.ProductStatus;
import com.imooc.manager.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Date;

//产品服务类
@Service
public class ProductService {
    private static Logger LOG = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product){
        LOG.debug("创建产品,请求参数:{}",product);

        //数据校验
         checkProduct(product);
        //设置默认值
        setDefault(product);

        //保存对象
        Product result=repository.save(product);
        LOG.debug("创建产品，结果:{}",result);
        return result;
    }

    //设置默认值
    //创建时间，更新时间
    //投资步长、锁定期、状态

    private void setDefault(Product product) {
        if(product.getCreateAt()==null){
            product.setCreateAt(new Date());
        }
        if (product.getUpdateAt()==null){
            product.setUpdateAt(new Date());
        }
        //??这里有些问题product.getStepAmount()==null
        if(product.getStepAmount(BigDecimal.ZERO) == null){
            product.setStepAmount(BigDecimal.ZERO);
        }
        if(product.getLockItem()==null){
            product.setLockItem(0);
        }
        if(product.getStatus()==null){
            product.setStatus(ProductStatus.AUDITING.name());
        }

    }


    //产品数据校验
    //1、非空数据
    //2、收益率0-30
    //3、投资步长需为整数

    private void checkProduct(Product product) {

        //
        Assert.notNull(product.getId(),"编号不可为空");
        Assert.isTrue(BigDecimal.ZERO.compareTo(product.getRewarrdRate())<0  && BigDecimal.valueOf(30).compareTo(product.getRewarrdRate())>=0,"收益率范围错误");
        //getStepAmount 这个函数参数可能有问题
        Assert.isTrue(BigDecimal.valueOf(product.getStepAmount(BigDecimal.ZERO).longValue()).compareTo(product.getStepAmount(BigDecimal.ZERO))==0,"投资步长需为整数");
    }
}
