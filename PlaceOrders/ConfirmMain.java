package 商品下单;

import java.util.Scanner;

public class ConfirmMain {
    public static void main(String[] args) {
        double price = 10;
        while (true) {
            System.out.println("------------订单确认-----------");
            System.out.println("订单编号：");
            System.out.println("订单详情：");
            System.out.println("收货地址：");
            System.out.println("合计（元）：");
            System.out.println("1确认信息并支付");
            System.out.println("-1取消订单");
            int select;
            Scanner in = new Scanner(System.in);
            select = in.nextInt();
            if(select==-1)
            {
                System.exit(0);
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
