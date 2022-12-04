package com.hdu.search.store;


import com.hdu.search.good.*;
import com.hdu.search.storyFactory.Store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2022-11-29 15:38
 */
public class FishStore implements Store {

    private List<Good> goods=new ArrayList<>();
    private static FishStore fishStore = new FishStore();

    private FishStore() {
        this.goods.add(new FishA());
        this.goods.add(new FishB());
        this.goods.add(new FishC());
        this.goods.add(new FishD());
        this.goods.add(new FishE());
        this.goods.add(new FishF());
        this.goods.add(new FishG());
    }



    public static FishStore getInstance() {
        return fishStore;
    }

    @Override
    public void showGoodInfo() {
        System.out.printf("%-6s\t%-6s\t%-6s\t%-6s%n","名称","价格","口味","评分");
        for(Good good: goods){
            System.out.printf("%-6s\t%-6.1f\t%-6s\t%-6.1f%n",good.getName(), good.getPrice(),good.getTaste(),
                   good.getScore());
        }
    }

    @Override
    public List<Good> getGoods() {
        return goods;
    }
}
