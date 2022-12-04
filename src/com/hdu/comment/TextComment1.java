package com.hdu.comment;

import java.util.Scanner;

public class TextComment1 implements TextComment {
    String Comment = "";
    String rank = "";
    private boolean IsPublish = false;
    @Override
    public void publish() {
        if(IsPublish){
            System.out.println("内容已经发表，无法再次发表,请先删除评价");
        }
        else {
            if(Comment.isEmpty())
                System.out.println("还没有输入评价，请先输入评价");
            else if(rank.isEmpty())
            {
                System.out.println("还给商家打分，请先打分");
            }
            else {
            IsPublish = true;
            System.out.println("内容已经发表");
            }
        }
    }

    @Override
    public void delete() {
        if(!IsPublish){
            System.out.println("当前没有评论");
        }
        else {
        rank = "";
        Comment = "";
        IsPublish = false;
        System.out.println("内容已经删除");
        }
    }

    @Override
    public void edit() {
        if(IsPublish){
            System.out.println("已经发表评论，无法再次发表");
        }
        else {
        System.out.println("请输入评价：");
        Scanner input = new Scanner(System.in);
        Comment = input.next();
        System.out.println("内容已经编辑完成");
        }
    }

    @Override
    public void rank() {
        if(IsPublish){
            System.out.println("已经打过分了，无法再次打分");
        }
        else {
        System.out.println("请输入打分：");
        Scanner input = new Scanner(System.in);
        rank = input.next();
        System.out.println("打分完成");
        }
    }

    @Override
    public void getComment() {
        if (!IsPublish){
            System.out.println("当前还没有发表评论");
        }
        else {
            System.out.println("给商家的打分为："+rank);
            System.out.println("评论："+Comment);
        }

    }
}
