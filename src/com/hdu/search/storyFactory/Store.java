package com.hdu.search.storyFactory;

import com.hdu.search.good.Good;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-11-29 15:39
 */
public interface Store {
    public void showGoodInfo();
    public List<Good> getGoods();
}
