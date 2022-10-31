package com.company.homework4;

import com.company.homework4.Heroes.Archer;
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
        Hero archer = new Archer("Hunter",500);
        while(archer.isAlive()){
            if(skeleton.isAlive()){
                archer.attackEnemy(skeleton);
                skeleton.attack(archer);
                archer.strengthAttack(skeleton);
            }
            if(smallSkeleton.isAlive()){
                archer.attackEnemy(smallSkeleton);
                smallSkeleton.attack(archer);
                archer.strengthAttack(smallSkeleton);
            }
        }

    }
}
