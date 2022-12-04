package com.hdu.comment;

public class TextCommentManagement  {
    private boolean exitFlag = false;

    public void exit() {
        exitFlag = true;
    }

    public void showMenu() {
        System.out.println("--------文字评价---------");
        System.out.println("1. 发表评论");
        System.out.println("2. 删除评论");
        System.out.println("3. 编辑评论");
        System.out.println("4. 给商家打分");
        System.out.println("5. 查看评论");
        System.out.println("6. 退出系统");
    }

    private void getUserInput(TextComment comment) {
        int choice = Choice.INPUT.nextInt();

        switch (choice) {
            case 1 -> comment.publish();
            case 2 -> comment.delete();
            case 3 -> comment.edit();
            case 4 -> comment.rank();
            case 5 -> comment.getComment();
            case 6 -> exit();
            default -> System.out.println("*********请输入(1-6)*********");
        }
    }


    public void init() {
        AbstractComment factory = null;
        factory = CommentProducer.getFactory("text");
        TextComment comment = factory.GetTextComment("text");

        while (true) {
            showMenu();
            getUserInput(comment);
            if (exitFlag) {
                break;
            }
        }
    }
}
