package com.hdu.search.searchStrategy;

import com.hdu.search.good.Good;

import java.util.*;

/**
 * @author shkstart
 * @create 2022-12-04 14:21
 */
public class SearchByTaste implements SearchStrategy{

    private String state;
    private Map<Integer,String> map=new HashMap<>();

    public SearchByTaste() {
        map.put(1,"酸辣");
        map.put(2,"甜");
        map.put(3,"咸");
        this.SelectInfo();
    }

    @Override
    public List<Good> getGoods(List<Good> goods) {
        List<Good> goodList=new ArrayList<>();
        for(Good good:goods){
            if(good.getTaste().equals(this.state))
                goodList.add(good);
        }
        return goodList;
    }

    @Override
    public void SelectInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("选择你喜欢的口味： 1:酸辣  2:甜  3:咸");
        this.state=map.get(in.nextInt());
        System.out.println("您选择的口味是："+this.state);
    }
}
