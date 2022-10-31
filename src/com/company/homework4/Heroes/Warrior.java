package com.company.homework4.Heroes;

import com.company.homework4.enemy.Enemy;


public class Warrior extends Hero  {
    private static final int damage  = 20;
    private final static int TIME_AFTER_STRENGTH_ATTACK  = 3;
    private int currentTimeAfterStrengthAttack  = 3;
    private static final int strengthAttack  = 200;
    public Warrior(String name,int healthBar) {
        super(name, healthBar);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        if(isAlive()) {
            System.out.println("The warrior is attacking " + enemy.getName());
            enemy.takeDamage(damage);
        }
    }

    @Override
    public void takeDamage(int takenDamage) {
        setHealthBar(getHealthBar() - takenDamage);
        System.out.println(getName() + " takes " + takenDamage + " damage");
        if(getHealthBar() > 0) System.out.println(getName() + " has " + getHealthBar() + " xp");
        else System.out.println(getName() + " dead");

    }

    @Override
    public void strengthAttack(Enemy enemy) {
        if (isAlive()) {
            if (currentTimeAfterStrengthAttack == TIME_AFTER_STRENGTH_ATTACK) {
                System.out.println("The warrior is attacking by strength attack " + enemy.getName());
                enemy.takeDamage(strengthAttack);
                currentTimeAfterStrengthAttack = 0;
            }
        }
        currentTimeAfterStrengthAttack++;
        if(!enemy.isAlive()){
            System.out.println(enemy.getName() + " is dead");
        }
    }
}
