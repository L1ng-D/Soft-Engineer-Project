package com.hdu.address;

public class AddrProducer {
    public static AbstractAddr getAddr(String name) {
        if(name.equalsIgnoreCase("MapAddr")) {
            System.out.println("Produce MapAddr");
            return new AbstractMapAddr();
        }
        else if(name.equalsIgnoreCase("CharAddr")) {
            System.out.println("Produce CharAddr");
            return new AbstractCharAddr();
            //return null;
        }
        else {
            System.out.println("No Item");
            return null;
        }
    }
}
