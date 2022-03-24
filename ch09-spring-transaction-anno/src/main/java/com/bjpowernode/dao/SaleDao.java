package com.bjpowernode.dao;

import com.bjpowernode.domain.goods;
import com.bjpowernode.domain.sale;
import org.apache.ibatis.annotations.Param;

public interface SaleDao {
    public void insertSale(sale sale);
}
