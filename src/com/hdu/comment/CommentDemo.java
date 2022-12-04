package com.hdu.comment;

public class CommentDemo {
    public void showMenu(){
        System.out.println("欢迎来到评价系统");
        System.out.println("1.文字评价");
        System.out.println("2.图片评价");
        System.out.println("3. 退出");
        System.out.println("请输入（1-3）：");
    }

    public static void main(String[] args) {
        int choice = 0;
        CommentDemo main = new CommentDemo();
        TextCommentManagement t = new TextCommentManagement();
        MediaCommentManagement m = new MediaCommentManagement();
        while (true){
            main.showMenu();
            choice = Choice.INPUT.nextInt();
            if(choice == 1){
                t.init();
            }else if(choice == 2){
                m.init();
            }else if (choice == 3) {
                return;
            }





//            if(choice.equals("1")){
//                System.out.println("1.发表评论");
//                System.out.println("2.删除评论");
//                System.out.println("3.编辑评论");
//                System.out.println("4.商家打分");
//                System.out.println("5.查看评论");
//                AbstractComment factory = null;
//                factory = CommentProducer.getFactory("text");
//                TextComment comment =factory.GetTextComment("text");
//                switch (choice) {
//                    case "1" -> comment.publish();
//                    case "2" -> comment.delete();
//                    case "3" -> comment.edit();
//                    case "4" -> comment.rank();
//                    case "5" -> comment.getComment();
//                }
//
//            }
//            if(choice.equals("2")){
//                System.out.println("11");
//            }
//            if(choice.equals("-1"))
//                break;
//            else {
//                System.out.println("输入有误，请重新输入");
//            }



        }
    }
}



