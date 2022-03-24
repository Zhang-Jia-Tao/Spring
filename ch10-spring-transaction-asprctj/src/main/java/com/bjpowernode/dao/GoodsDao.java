package com.bjpowernode.dao;

import com.bjpowernode.domain.goods;

public interface GoodsDao {

    //更新库存
    //goods表示本次用户购买的商品信息
    public void updateGoods(goods good);

    //查询商品的信息
    public goods selectGoods(Integer id);
}
