package com.hdu.search.searchStrategy;


import com.hdu.search.good.Good;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-12-04 13:48
 */
public class Sever {
    private SearchStrategy strategy;
    public Sever(){

    }

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Good> getGoods(List<Good> goods){
        return strategy.getGoods(goods);
    }


}
