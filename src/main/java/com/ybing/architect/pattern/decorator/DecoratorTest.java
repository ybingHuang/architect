package com.ybing.architect.pattern.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Timor timor = new Timor("提莫");
        Skill_R r = new Skill_R("种蘑菇", timor);
        Skill_Q q = new Skill_Q("致盲吹箭", r);
        Skill_W w = new Skill_W("提莫快跑", q);
        w.skill();
    }
}
