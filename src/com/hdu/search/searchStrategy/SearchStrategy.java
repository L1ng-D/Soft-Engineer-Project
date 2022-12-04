package com.hdu.search.searchStrategy;

import com.hdu.search.good.Good;
import com.hdu.search.storyFactory.Store;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-12-04 13:46
 */
public interface SearchStrategy {
    public List<Good> getGoods(List<Good> goods);
     public void SelectInfo();
}
