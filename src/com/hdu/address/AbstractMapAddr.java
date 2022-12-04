package com.hdu.address;

public class AbstractMapAddr extends AbstractAddr {
    @Override
    public MapAddr getMapAddr(String name) {
        System.out.println("This is MA");
        if(name.equalsIgnoreCase("Map1")) {
            System.out.println("Map1 is ok");
            return new Map1();
        }else if(name.equalsIgnoreCase("Map2")) {
            System.out.println("Map2 is ok");
            return new Map2();
        }
        else {
            System.out.println("couldn't find a correct addr");
            return null;
        }

    }

    @Override
    public CharAddr getCharAddr(String name) {
        //
        return null;
    }
}

