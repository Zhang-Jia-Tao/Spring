package com.bjpowernode.service;

public interface Trade {

    //购买商品的方法，goodsId：商品编号  nums：购买商品的数量
    public void Buy(Integer goodsId,Integer nums);
}
