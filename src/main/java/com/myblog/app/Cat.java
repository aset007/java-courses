package com.myblog.app;

/**
 * Created by 1 on 21.09.2015.
 */
public class Cat extends Pet {

    public Cat(final String name) {
        super(name);
    }

    public String toString () {
        return "Кот " + this.getName();
    }
}
