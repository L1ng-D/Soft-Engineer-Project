package com.hdu.address;

public class AbstractCharAddr extends AbstractAddr {
    @Override
    public MapAddr getMapAddr(String name) {
        ///
        return null;
    }

    @Override
    public CharAddr getCharAddr(String name) {
        System.out.println("This is CA");
        if(name.equalsIgnoreCase("Char1")) {
            System.out.println("Char1 is ok");
            return new Char1();
        }else if(name.equalsIgnoreCase("Char2")) {
            System.out.println("Char2 is ok");
            return new Char2();
        }
        else {
            System.out.println("couldn't find a correct MapAddr");
            return null;
        }
    }

}
