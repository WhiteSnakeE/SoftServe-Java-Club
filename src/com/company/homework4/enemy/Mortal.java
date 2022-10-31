package com.company.homework4.enemy;

import com.company.homework4.Heroes.Hero;

public interface Mortal {
    boolean isAlive();
    void attack(Hero hero);
}
