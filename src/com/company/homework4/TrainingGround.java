package com.company.homework4;

import com.company.homework4.Heroes.Hero;
import com.company.homework4.Heroes.Mage;
import com.company.homework4.enemy.Enemy;
import com.company.homework4.enemy.Skeleton;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy skeleton  = new Skeleton("Skeleton",200);
        Hero mage = new Mage("Mage",500);
        mage.attackEnemy(skeleton);
        skeleton.attack(mage);
    }
}
