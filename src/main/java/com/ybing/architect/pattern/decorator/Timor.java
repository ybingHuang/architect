package com.ybing.architect.pattern.decorator;

public class Timor implements Hero {

    private String name;

    public Timor(String name) {
        this.name = name;
    }

    @Override
    public void skill() {
        System.out.println(name + "Timor 学会了以上技能");
    }
}
