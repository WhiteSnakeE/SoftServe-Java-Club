package com.company.homework4;

import com.company.homework4.Heroes.Hero;
import com.company.homework4.Heroes.Mage;
import com.company.homework4.Heroes.Warrior;
import com.company.homework4.enemy.Enemy;
import com.company.homework4.enemy.Skeleton;
import com.company.homework4.enemy.Zombie;
import com.company.homework4.periodDamage.HeroPeriodDamage;


public class BattleGround {
    public static void main(String[] args) {
        Enemy skeleton  = new Skeleton("Skeleton",200);
        Enemy smallSkeleton  = new Skeleton("Small Skeleton",150);
        Hero mage = new Mage("Mage",500);
        while(mage.isAlive()){
            if(skeleton.isAlive()){
                mage.attackEnemy(skeleton);
                skeleton.attack(mage);
                mage.strengthAttack(skeleton);
            }
            if(smallSkeleton.isAlive()){
                mage.attackEnemy(smallSkeleton);
                smallSkeleton.attack(mage);
                mage.strengthAttack(smallSkeleton);
            }
        }

    }
}
