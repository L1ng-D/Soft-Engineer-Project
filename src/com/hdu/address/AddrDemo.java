package com.hdu.address;

public class AddrDemo {
    public static void main(String[] args){
        AbstractAddr a= AddrProducer.getAddr("MapAddr");
        MapAddr b=a.getMapAddr("Map2");
        AbstractAddr d= AddrProducer.getAddr("CharAddr");
        CharAddr c=d.getCharAddr("Char2");
        Observer user1=new MeituanUser("美团用户 张三",b,c);
        user1.update();
    }
}
