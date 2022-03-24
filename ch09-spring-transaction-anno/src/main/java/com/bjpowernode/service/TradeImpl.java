package com.bjpowernode.service;

import com.bjpowernode.Exception.NotEnough;
import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.domain.goods;
import com.bjpowernode.domain.sale;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class TradeImpl implements Trade {

    private SaleDao saleDao;
    private GoodsDao goodsDao;


    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            /*rollbackFor：表示发生指定的异常，一定会回滚
            *   处理逻辑是：
            *           1）spring会首先检查抛出的异常是不是在rollbackFor的属性值当中，
            *              如果在其中一定会回滚
            *           2）如果抛出的异常不在rollbackFor列表中，spring会判断抛出的异常
            *              是否为运行时异常，如果是一定会回滚
            * */
            rollbackFor = {
                    NullPointerException.class,NotEnough.class
            }
    )

    @Override
    public void Buy(Integer goodsId, Integer nums) {
        System.out.println("==Buy方法的开始==");

        //记录销售信息，向sale表添加数据
        sale sale = new sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        //更新库存
        //先查询库存信息
        goods good = goodsDao.selectGoods(goodsId);
        if(good == null){
            throw new NullPointerException("编号是"+goodsId+",商品不存在");
        } else if(good.getAmount() < nums){
            throw new NotEnough("编号是"+goodsId+"，商品数量不足");
        }
        //修改库存
        goods BuyGood = new goods();
        BuyGood.setId(goodsId);
        BuyGood.setAmount(nums);
        goodsDao.updateGoods(BuyGood);

        System.out.println("==Buy方法的完成==");
    }


    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
