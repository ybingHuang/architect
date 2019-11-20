package com.ybing.architect.pattern.decorator;

public class Skill_Q extends HeroSkill {

    private String name;

    public Skill_Q(String name, Hero hero) {
        super(hero);
        this.name = name;
    }

    @Override
    public void skill() {
        System.out.println("学习了技能Q : " + name);
        super.skill();
    }
}
