package com.hdu.comment;

public abstract class AbstractComment {
    public abstract MediaComment1 GetMediaComment(String media);//返回接口实现类
    public abstract TextComment1 GetTextComment(String Text);//返回接口实现类
}
