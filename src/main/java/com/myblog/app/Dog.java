package com.myblog.app;

/**
 * Created by 1 on 21.09.2015.
 */
public class Dog extends Pet {

    public Dog(final String name) {
        super(name);
    }

    public String toString () {
        return "Собака " + this.getName();
    }
}
