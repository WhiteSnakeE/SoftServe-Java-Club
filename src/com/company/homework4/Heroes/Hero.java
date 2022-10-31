package com.company.homework4.Heroes;

import com.company.homework4.enemy.Enemy;

public abstract class Hero {
    private  String name;
    private int healthBar;
    private final static int TIME_AFTER_STRENGTH_ATTACK  = 3;
    private int currentTimeAfterStrengthAttack  = 3;

    protected Hero(String name, int healthBar) {
        this.name = name;
        this.healthBar = healthBar;
    }

    public Hero() {
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

    protected void setHealthBar(int healthBar) {
        this.healthBar = healthBar;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void takeDamage(int takenDamage);

    public boolean isAlive(){
        return healthBar > 0;
    }

    public  abstract void strengthAttack(Enemy enemy);

}
