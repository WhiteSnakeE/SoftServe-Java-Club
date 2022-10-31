package com.company.homework4.enemy;

import com.company.homework4.Heroes.Hero;

public abstract class Enemy implements Mortal {
    private String name;
    private int healthBar;


    public Enemy(String name, int healthBar) {
        this.name = name;
        this.healthBar = healthBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(int healthBar) {
        this.healthBar = healthBar;
    }

    public abstract void takeDamage(int damage);

    @Override
    public boolean isAlive() {
       return healthBar > 0;
    }

    @Override
    public abstract void attack(Hero hero);

}
