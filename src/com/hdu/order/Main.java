package com.hdu.order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price = 10;
        while (true) {
            System.out.println("------------订单确认-----------");
            System.out.println("订单编号：12344455");
            System.out.println("订单详情：xxxx");
            System.out.println("收货地址：xxxx");
            System.out.println("合计（元）：10");
            System.out.println("1.确认信息并支付");
            System.out.println("-1.取消订单");
            System.out.print("请选择:");
            int select;
            Scanner in = new Scanner(System.in);
            select = in.nextInt();
            if(select==-1)
            {
                return;
            }
            else
            {
                ConfirmAPI InfoConfirm=new InfoConfirm();
                InfoConfirm.Confirm();
                PayMain.PayMain(price);
            }
        }
    }
}
