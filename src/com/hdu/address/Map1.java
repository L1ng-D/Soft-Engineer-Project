package com.hdu.address;

public class Map1 implements MapAddr {
    String fsname="";
    String fscontent="";
    public void delete() {
        fscontent="";
        System.out.println("Delete Successful");
    }
    public void edit(String content) {
        fscontent=content;
        System.out.println("Edit Successful");
    }
    public String getAddr() {
        return "Map1 is hdu";
    }
}
