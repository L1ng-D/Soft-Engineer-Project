package com.hdu.order;

import java.util.Scanner;

public class PayMain {
    public static void PayMain(double price)
    {
        while(true)
        {
            System.out.println("------------订单支付-----------");
            System.out.println("1.支付宝支付");
            System.out.println("2.银行卡支付");
            System.out.println("3.微信支付");
            System.out.println("4.取消支付");
            System.out.println("请选择(1-4)：");
            int select;
            Scanner in=new Scanner(System.in);
            select=in.nextInt();
            AllPay AllPay=new AllPay();
            switch (select)
            {
                case 1:
                {
                    AllPay.pay("AliPay",price);
                    return;
                }
                case 2:
                {
                    AllPay.pay("BankCards",price);
                    return;
                }
                case 3:
                {
                    AllPay.pay("WeChat",price);
                    return;
                }
                case 4:
                {
                    return;
                }
            }
        }
    }
}
