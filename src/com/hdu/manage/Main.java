package com.hdu.manage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("------------订单管理-----------");
            System.out.println("1.全部订单");
            System.out.println("2.待付款订单");
            System.out.println("3.待收货订单");
            System.out.println("4.待评价订单");
            System.out.println("5.退款/售后");
            System.out.println("6.退出");
            System.out.println("请选择(1-6)：");
            int select;
            Scanner in=new Scanner(System.in);
            select=in.nextInt();
            if (select == 6) return;
            Case Case=new Case();
            Case.Case(select);
        }
    }
}
