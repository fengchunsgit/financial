package com.imooc.entity;


import java.math.BigDecimal;
import java.util.Date;

//产品
//@see ProductStatus
public class Product {
    private String id;
    private String name;
    private String status;
    private BigDecimal thresholdAmount;
    private BigDecimal stepAmount;
    private Integer lockItem;
    private BigDecimal rewarrdRate;
    private String memo;
    private Date createAt;
    private Date updateAt;
    private String createUser;
    private String updateUser;

    public static void main(String[] args) {
        System.out.println(new Product());
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", thresholdAmount=" + thresholdAmount +
                ", stepAmount=" + stepAmount +
                ", lockItem=" + lockItem +
                ", rewarrdRate=" + rewarrdRate +
                ", memo='" + memo + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getThresholdAmount() {
        return thresholdAmount;
    }

    public void setThresholdAmount(BigDecimal thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    public BigDecimal getStepAmount(BigDecimal zero) {
        return stepAmount;
    }

    public void setStepAmount(BigDecimal stepAmount) {
        this.stepAmount = stepAmount;
    }

    public Integer getLockItem() {
        return lockItem;
    }

    public void setLockItem(Integer lockItem) {
        this.lockItem = lockItem;
    }

    public BigDecimal getRewarrdRate() {
        return rewarrdRate;
    }

    public void setRewarrdRate(BigDecimal rewarrdRate) {
        this.rewarrdRate = rewarrdRate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
