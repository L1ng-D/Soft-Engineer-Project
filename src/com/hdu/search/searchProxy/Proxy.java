package com.hdu.search.searchProxy;

import com.hdu.search.good.Good;
import com.hdu.search.searchStrategy.*;
import com.hdu.search.storyFactory.Store;
import com.hdu.search.storyFactory.StoreFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-11-28 19:54
 */
public class Proxy {
    private Store store;
    private List<Good> goods;
    private Scanner input;
    private int storeChoice;
    private List<SearchStrategy> strategies=new ArrayList<>();
    private int strategyChoice;
    private Sever sever=new Sever();

    public Proxy(){
        this.input=new Scanner(System.in);
        this.showStoreInfo();
        this.getUserStoreInput();
        this.store.showGoodInfo();
        this.showStrategy();
        this.SelectPrefer();
        this.GoodsRecommend();
    }

    private void showStoreInfo() {
        System.out.println("请选择商家：(-1退出)");
        System.out.println("1. FishStore");
    }

    private void getUserStoreInput() {
        while(true) {
            this.storeChoice = this.input.nextInt();
            if (this.storeChoice == -1) return;
            else {
                this.store = StoreFactory.getStore(this.storeChoice);
                this.goods=this.store.getGoods();
                if (this.store == null) {
                    System.out.println("您输入的商家不存在！");
                    continue;
                }
            }
            return;
        }
    }

    private void showStrategy() {
        System.out.println("1. 请选择你喜欢的口味");
        System.out.println("2. 请选择你能接受的价格");
        System.out.println("3. 按好评度排序");
        System.out.println("-1(完成)");
    }

    private void SelectPrefer() {
        while(true){
           this.strategyChoice = this.input.nextInt();
            if (this.strategyChoice == -1) break;
            else if(this.strategyChoice==1){
                SearchStrategy strategy=new SearchByTaste();
                this.strategies.add(strategy);
            }
            else if(strategyChoice==2){
                SearchStrategy strategy=new SearchByPrice();
                this.strategies.add(strategy);
            }
            else if(strategyChoice==3){
                SearchStrategy strategy = new SortByScore();
                this.strategies.add(strategy);
            }
            else
                System.out.println("Wrong Choice!!!");
            this.showStrategy();
        }
    }

    private void GoodsRecommend(){
        if(strategies==null) this.showGoodInfo();
        else {
            for(SearchStrategy strategy: this.strategies){
                this.sever.setStrategy(strategy);
                this.goods=this.sever.getGoods(this.goods);
            }
            this.showGoodInfo();
            this.strategies=null;
        }
    }

    public void showGoodInfo() {
        System.out.println("\n为您推荐如下美食");
        System.out.printf("%-6s\t%-6s\t%-6s\t%-6s%n","名称","价格","口味","评分");
        for(Good good: this.goods){
            System.out.printf("%-6s\t%-6.1f\t%-6s\t%-6.1f%n",good.getName(), good.getPrice(),good.getTaste(),
                    good.getScore());
        }
    }
}
