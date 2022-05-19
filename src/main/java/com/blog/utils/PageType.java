package com.blog.utils;

public enum PageType {
    BLOG(100),CONTENT(200);

    private int value;

    private PageType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
