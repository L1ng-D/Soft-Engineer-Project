package com.hdu.address;

public class MeituanUser extends Observer {
    public MeituanUser(String name, MapAddr m1, CharAddr c1) {
        this.name=name;
        this.subMap1=m1;
        this.subChar1=c1;
    }
    @Override
    public void update() {
        System.out.printf("%s 已获得Map1的信息:%s%n",name,subMap1.getAddr());
        //System.out.printf("%s 已获得朋友圈Photo2的信息:%s%n",name,subPhoto2.getNews());
        System.out.printf("%s 已获得Char1的信息:%s%n",name,subChar1.getAddr());
        //System.out.printf("%s 已获得朋友圈Vedio2的信息:%s%n",name,subVedio2.getNews());
    }
}
