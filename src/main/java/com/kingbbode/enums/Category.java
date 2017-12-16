package com.kingbbode.enums;

/**
 * Created by YG-MAC on 2017. 12. 16..
 */
public enum Category {
    ACTIVITY,
    PROJECT;


    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
