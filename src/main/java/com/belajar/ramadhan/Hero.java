package com.belajar.ramadhan;

public class Hero {
    private String name;
    private int damage;
    private int hp;
    private Hero hero;
    private Skill skill;
    private Skin skin;

    public Hero(String name, int damage, int hp, Skill skill, Skin skin) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.skill = skill;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(Hero enemy) {
        int hpEnemy = enemy.getHp();
        hpEnemy -= damage + Util.getDamageFromSkill(skill) + skin.getDamage();

        enemy.setHp(hpEnemy);
    }


}
