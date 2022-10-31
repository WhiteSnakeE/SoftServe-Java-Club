package com.company.homework4.Heroes;

import com.company.homework4.enemy.Enemy;
import com.company.homework4.periodDamage.HeroPeriodDamage;

public class Mage extends Hero {
    private final int damage  = 50;
    private final int strengthAttack  = HeroPeriodDamage.FREEZE.getDAMAGE();
    private final static int FREEZE_TIME = HeroPeriodDamage.FREEZE.getTURNS_COUNT_OF_DEBUFF();
    private final static int  FREEZE_DAMAGE = HeroPeriodDamage.FREEZE.getDEBUFF_DAMAGE();
    private int timeForNextFreeze = HeroPeriodDamage.FREEZE.getCurrentTurn();
    public Mage(String name,int healthBar) {
        super(name,healthBar);
    }
    @Override
    public void attackEnemy(Enemy enemy) {

        System.out.println("Mage is attacking " + enemy.getName());
        enemy.takeDamage(damage);
        if(timeForNextFreeze<=FREEZE_TIME && timeForNextFreeze!=0) timeForNextFreeze--;
    }

    @Override
    public void takeDamage(int takenDamage) {
        setHealthBar(getHealthBar() - takenDamage);
        System.out.println(getName() + " takes " + takenDamage + " damage");
        if(isAlive()) System.out.println(getName() + " has " + getHealthBar() + " xp");
        else System.out.println(getName() + " dead");
    }

    @Override
    public boolean isAlive() {
        return getHealthBar() > 0;
    }

    @Override
    public void strengthAttack(Enemy enemy) {
        if (isAlive()) {
            if (timeForNextFreeze==0) {
                System.out.println("The mage is attacking by strength attack " + enemy.getName());
                enemy.takeDamage(strengthAttack);
                System.out.println(enemy.getName() + " gets freezing damage on 3 turns");
                timeForNextFreeze = FREEZE_TIME;
            }
            if(timeForNextFreeze>0 && enemy.isAlive()){
                enemy.takeDamage(FREEZE_DAMAGE);
                System.out.println(enemy.getName() + " get damage from freeze " + FREEZE_DAMAGE);
                System.out.println("Freeze turns are " + timeForNextFreeze);
            }
        }
        if(!enemy.isAlive()){
            System.out.println(enemy.getName() + " is dead");
        }

    }
}
