package com.hdu.manage;

import java.util.Scanner;

public class Case {
    public void type()
    {
        System.out.println("请选择操作类型(1-6)");
        System.out.println("1.查看订单");
        System.out.println("2.删除订单");
        System.out.println("3.再来一单");
        System.out.println("4.评价订单");
        System.out.println("5.售后/退款");
        System.out.println("6.退出");
    }

    public void OrderID(int select)
    {
        switch (select)
        {
            case 1:
            {
                System.out.println("------------全部订单-----------");
                System.out.println("编号：1 订单1(待付款)");
                System.out.println("编号：2 订单2(待收货)");
                System.out.println("编号：3 订单3(待使用)");
                System.out.println("编号：4 订单4(待评价)");
                System.out.println("编号：5 订单5(待退款)");
                System.out.println("请选择订单编号");
                System.out.println("-1退出");
                break;
            }
            case 2:
            {
                System.out.println("------------待付款订单-----------");
                System.out.println("编号：1 订单1(待付款)");
                System.out.println("请选择订单编号");
                System.out.println("-1退出");
                break;
            }
            case 3:
            {
                System.out.println("------------待收货订单-----------");
                System.out.println("编号：2 订单2(待收货)");
                System.out.println("请选择订单编号");
                System.out.println("-1退出");
                break;
            }
            case 4:
            {
                System.out.println("------------待评价订单-----------");
                System.out.println("编号：4 订单4(待收货)");
                System.out.println("请选择订单编号");
                System.out.println("-1退出");
                break;
            }
            case 5:
            {
                System.out.println("------------待售后订单-----------");
                System.out.println("编号：5 订单5(待收售后");
                System.out.println("请选择订单编号");
                System.out.println("-1退出");
                break;
            }
            case 6:
            {
                return;
            }
        }
    }
    public void Case(int select)
    {
        if (select == 6) return;
        OrderID(select);
        int OrderId;
        Scanner in=new Scanner(System.in);
        OrderId=in.nextInt();
        if(OrderId==-1)
            return;
        type();
        int type=in.nextInt();
//        if(type==6)
//            System.exit(0);
//            return;
        Broker broker=new Broker();
        broker.TakeOrder(OrderId,type);
        broker.PlaceOrder();
    }
}


