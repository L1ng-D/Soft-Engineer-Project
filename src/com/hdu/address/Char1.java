package com.hdu.address;

public class Char1 implements CharAddr {
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
        return "Char1 is hdu";
    }
}
