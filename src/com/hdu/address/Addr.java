package com.hdu.address;

public class Addr {
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
}
