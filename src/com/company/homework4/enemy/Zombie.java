package com.company.homework4.enemy;

import com.company.homework4.Heroes.Hero;

import java.util.Random;

public class Zombie extends Enemy{
    private final static int damage = 30;
    private int lives = 1;
    private final int  healthBar = getHealthBar();
    public Zombie(String name, int healthBar) {
        super(name, healthBar);
    }

    @Override
    public void takeDamage(int damage) {
        if(isAlive()) {
            setHealthBar(getHealthBar() - damage);
            System.out.println(getName() + " takes " + damage + " damage");
            if (getHealthBar() > 0) System.out.println(getName() + " has " + getHealthBar() + " xp");
            else if (lives == 1) {
                setHealthBar(healthBar);
                lives--;
                System.out.println("Zombie were resurrected");

            } else {
                System.out.println(getName() + " dead");
            }
        }
    }

    @Override
    public void attack(Hero hero) {
        if(isAlive()) {
            if (hero.isAlive()) {
                hero.takeDamage(damage * new Random().nextInt(2)+1);
            }
        }
    }


}
