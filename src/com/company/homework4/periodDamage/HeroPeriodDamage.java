package com.company.homework4.periodDamage;

public enum HeroPeriodDamage {
    POISON(3,0,75,10), FREEZE(3,0,100,15);
    private final int TURNS_COUNT_OF_DEBUFF;
    private int currentTurn;
    private final int DAMAGE;
    private final int DEBUFF_DAMAGE;

    HeroPeriodDamage(int turns_count_of_debuff, int currentTurn, int damage, int debuff_damage) {
        TURNS_COUNT_OF_DEBUFF = turns_count_of_debuff;
        this.currentTurn = currentTurn;
        DAMAGE = damage;
        DEBUFF_DAMAGE = debuff_damage;
    }


    public int getTURNS_COUNT_OF_DEBUFF() {
        return TURNS_COUNT_OF_DEBUFF;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public int getDAMAGE() {
        return DAMAGE;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public int getDEBUFF_DAMAGE() {
        return DEBUFF_DAMAGE;
    }

    @Override
    public String toString() {
        return "HeroPeriodDamage{" +
                "TURNS_COUNT_OF_DEBUFF=" + TURNS_COUNT_OF_DEBUFF +
                ", currentTurn=" + currentTurn +
                ", DAMAGE=" + DAMAGE +
                ", DEBUFF_DAMAGE=" + DEBUFF_DAMAGE +
                '}';
    }
}
