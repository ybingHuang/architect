package com.ybing.architect.pattern.decorator;

public class HeroSkill implements Hero {

    private Hero hero;

    public HeroSkill(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void skill() {
        hero.skill();
    }
}
