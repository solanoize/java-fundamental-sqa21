package com.belajar.ramadhan;

import java.util.Random;

public class Util {

    public static int getDamageFromSkill(Skill skill) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1; // Menghasilkan angka 1, 2, atau 3
        switch (randomNumber) {
            case 1:
                return skill.getDamageMiddle();
            case 2:
                return skill.getDamageUp();
            case 3:
                return skill.getUltimate();
            default:
                return skill.getDamageMiddle();
        }
    }
}
