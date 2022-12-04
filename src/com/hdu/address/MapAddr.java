package com.hdu.address;

public interface MapAddr {
    String fsname="";
    String fscontent="";
    public void delete() ;
    public void edit(String content);
    public String getAddr();
}
