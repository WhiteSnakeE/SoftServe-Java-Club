package com.company.homework4.Heroes;

import com.company.homework4.enemy.Enemy;
import com.company.homework4.periodDamage.HeroPeriodDamage;

public class Archer extends Hero {
    private int damage = 40;
    private final int strengthAttack  = HeroPeriodDamage.POISON.getDAMAGE();
    private final static int POISON_TIME = HeroPeriodDamage.POISON.getTURNS_COUNT_OF_DEBUFF();
    private final static int  POISON_DAMAGE = HeroPeriodDamage.POISON.getDEBUFF_DAMAGE();
    private int timeForNextPoison = HeroPeriodDamage.POISON.getCurrentTurn();
    public Archer(String name, int healthBar) {
        super(name, healthBar);
    }

    public int getDamage() {
        return damage;
    }

    private void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer is attacking  " + enemy.getName());
        enemy.takeDamage(damage);
        if(timeForNextPoison<=POISON_TIME && timeForNextPoison!=0) timeForNextPoison--;
    }

    @Override
    public void takeDamage(int takenDamage) {
        setHealthBar(getHealthBar() - takenDamage);
        System.out.println(getName() + " takes " + takenDamage + " damage");
        if(getHealthBar() > 0) System.out.println(getName() + " has " + getHealthBar() + " xp");
        else System.out.println(getName() + " dead");
    }

    @Override
    public boolean isAlive() {
        return getHealthBar() > 0;
    }

    @Override
    public void strengthAttack(Enemy enemy) {
        if(isAlive()) {
            if (timeForNextPoison==0) {
                System.out.println("The archer is attacking by strength attack " + enemy.getName());
                System.out.println(enemy.getName() + " gets poison damage on 3 turns");
                enemy.takeDamage(strengthAttack);
                timeForNextPoison = POISON_TIME;
            }
            if(timeForNextPoison>0 && enemy.isAlive()){
                enemy.takeDamage(POISON_DAMAGE);
                System.out.println("Enemy get damage from poison " + POISON_DAMAGE);
                System.out.println("Poison turns are " + timeForNextPoison);
            }
        }
        if(!enemy.isAlive()){
            System.out.println(enemy.getName() + " is dead");
        }

    }


}
