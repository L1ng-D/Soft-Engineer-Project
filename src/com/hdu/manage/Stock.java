package com.hdu.manage;

public class Stock {
    private int OrderId;
    private int type;
    public Stock(int id,int type){
        this.OrderId=id;
        this.type=type;
    }
    public void Show()
    {
        System.out.println("订单编号"+this.OrderId+":订单详情");
    }
    public void Delete()
    {
        System.out.println("订单编号为"+this.OrderId+"的订单已删除");
    }
    public void Add()
    {
        System.out.println("即将前往下单系统");
        System.out.println("已为订单编号为"+this.OrderId+"的订单再次下单");
    }
    public void Evaluate()
    {
        System.out.println("即将前往订单评价系统");
        System.out.println("已为订单编号为"+this.OrderId+"的订单完成评价");
    }
    public void AfterSales()
    {
        System.out.println("订单编号为"+this.OrderId+"的订单的退款进度如下");
    }
}
