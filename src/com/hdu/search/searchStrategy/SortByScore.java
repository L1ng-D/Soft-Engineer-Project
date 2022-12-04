package com.hdu.search.searchStrategy;

import com.hdu.search.good.Good;
import com.hdu.search.storyFactory.Store;

import java.util.Collections;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-12-04 14:22
 */
public class SortByScore implements SearchStrategy{


    @Override
    public List<Good> getGoods(List<Good> goods) {
        Collections.sort(goods);
        return goods;
    }

    @Override
    public void SelectInfo() {
        System.out.println("已按好评度降序排序");
    }


}
