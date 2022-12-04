package com.hdu.search.searchStrategy;

import com.hdu.search.good.Good;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-12-04 14:21
 */
public class SearchByPrice implements SearchStrategy{
    private double low=Double.MIN_VALUE;
    private double high=Double.MAX_VALUE;

    public SearchByPrice() {
        this.SelectInfo();
    }

    @Override
    public List<Good> getGoods(List<Good> goods) {
        List<Good> goodList=new ArrayList<>();
        for(Good good:goods){
            if(good.getPrice()>=low&&good.getPrice()<=high)
                goodList.add(good);
        }
        return goodList;
    }

    @Override
    public void SelectInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("你能接受的最低价格：");
        this.low=in.nextDouble();
        System.out.print("你能接受的最高价格：");
        this.high=in.nextDouble();
        System.out.println("你选择的价格区间是："+low+"~"+high);
    }
}
