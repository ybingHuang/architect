package com.ybing.architect.pattern.decorator;

public class Skill_W extends HeroSkill {

    private String name;

    public Skill_W(String name, Hero hero) {
        super(hero);
        this.name = name;
    }

    @Override
    public void skill() {
        System.out.println("学习了技能W : " + name);
        super.skill();
    }
}
