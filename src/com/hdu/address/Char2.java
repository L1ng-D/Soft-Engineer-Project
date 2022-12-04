package com.hdu.address;

public class Char2 implements CharAddr {
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
        return "Char2 is hdu";
    }
}
