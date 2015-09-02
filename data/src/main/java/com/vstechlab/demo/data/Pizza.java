package com.vstechlab.demo.data;

public abstract class Pizza {
    String name;
    String dough;

    void prepare() {

    }

    void bake() {
        System.out.println("Super Pizza");
    }
}
