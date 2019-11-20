package com.ybing.architect.pattern.decorator;

public class Skill_R extends HeroSkill {

    private String name;

    public Skill_R(String name, Hero hero) {
        super(hero);
        this.name = name;
    }

    @Override
    public void skill() {
        System.out.println("学习了技能R : " + name);
        super.skill();
    }
}
