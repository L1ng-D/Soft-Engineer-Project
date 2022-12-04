package com.hdu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            // 输出菜单
            System.out.println("------------欢迎进入外卖系统-----------");
            System.out.println("1.确认下单");
            System.out.println("2.订单管理");
            System.out.println("3.地址管理");
            System.out.println("4.搜索");
            System.out.println("5.评论");
            System.out.println("6.退出");
            System.out.println("------------------------------------");
            System.out.print("请选择(1-6)：");

            int choice = in.nextInt();
            switch (choice){
                case 1: com.hdu.order.Main.main(new String[]{"1"}); break; // 下单
                case 2: com.hdu.manage.Main.main(new String[]{"1"}); break;// 订单管理
                case 3: com.hdu.address.Main.main(new String[]{"1"}); break;// 地址设置
                case 4: com.hdu.search.Main.main(new String[]{"1"}); break;// 搜索
                case 5: com.hdu.comment.CommentDemo.main(new String[]{"1"}); break;// 评论
                case 6: System.exit(0); break;
            }
        }


    }
}
