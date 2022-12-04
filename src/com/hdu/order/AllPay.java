package com.hdu.order;

public class AllPay implements com.hdu.order.AliPay {
    com.hdu.order.AliPay AliPay;
    @Override
    public void pay(String type, double price) {
        if(type.equals("AliPay"))
        {
            System.out.println("将为您使用支付宝支付"+price+"元");
        } else if (type.equals("BankCards")||type.equals("WeChat")) {
            AliPay=new PayAdapter(type);
            AliPay.pay(type,price);
        }
        else{
            System.out.println("请重新选择支付模式");
        }
    }
}
