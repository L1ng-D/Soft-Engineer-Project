package com.hdu.address;

public abstract class Observer {
    public MapAddr subMap1;
    public CharAddr subChar1;
    public String name;

    abstract public void update();
}
