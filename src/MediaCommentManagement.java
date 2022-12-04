public class MediaCommentManagement  {
    private boolean exitFlag = false;

    public void exit() {
        exitFlag = true;
    }

    public void showMenu() {
        System.out.println("--------图片评价---------");
        System.out.println("1. 发表评论");
        System.out.println("2. 删除评论");
        System.out.println("3. 编辑评论");
        System.out.println("4. 给商家打分");
        System.out.println("5. 上传图片");
        System.out.println("6. 查看评论");
        System.out.println("7. 退出系统");
    }

    private void getUserInput(MediaComment comment) {
        int choice = Choice.INPUT.nextInt();

        switch (choice) {
            case 1 -> comment.publish();
            case 2 -> comment.delete();
            case 3 -> comment.edit();
            case 4 -> comment.rank();
            case 5 -> comment.media();
            case 6 -> comment.getComment();
            case 7 -> exit();
            default -> System.out.println("*********请输入(1-6)*********");
        }
    }


    public void init() {
        AbstractComment factory = null;
        factory = CommentProducer.getFactory("media");
        MediaComment comment = factory.GetMediaComment("media");

        while (true) {
            showMenu();
            getUserInput(comment);
            if (exitFlag) {
                break;
            }
        }
    }
}
