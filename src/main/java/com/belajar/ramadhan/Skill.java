package com.belajar.ramadhan;

public class Skill {
    private int damageMiddle = 1;
    private int damageUp = 2;
    private int ultimate = 3;

    public Skill(int damageMiddle, int damageUp, int ultimate) {
        this.damageMiddle = damageMiddle;
        this.damageUp = damageUp;
        this.ultimate = ultimate;
    }

    public int getDamageMiddle() {
        return damageMiddle;
    }

    public void setDamageMiddle(int damageMiddle) {
        this.damageMiddle = damageMiddle;
    }

    public int getDamageUp() {
        return damageUp;
    }

    public void setDamageUp(int damageUp) {
        this.damageUp = damageUp;
    }

    public int getUltimate() {
        return ultimate;
    }

    public void setUltimate(int ultimate) {
        this.ultimate = ultimate;
    }
}
