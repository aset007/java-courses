package com.myblog.app;

/**
 * Описывает поведение питомца.
 * Created by 1 on 21.09.2015.
 */
public abstract class Pet {
    private String name;

    public Pet (final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
