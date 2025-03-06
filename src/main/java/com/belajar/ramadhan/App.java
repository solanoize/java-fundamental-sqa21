package com.belajar.ramadhan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Kalkulator kalkulator = new Kalkulator();
//        int hasil = kalkulator.jumlahkan(10, 20);
//        Kalkulator.sayHello();
//        System.out.println(hasil);
//        BahanBakar bahanBakar = new BahanBakar();
//        Payment payment = new Payment();
//
//        Mobil asemKa = new Mobil(bahanBakar, payment);
//        asemKa.jalan();
//        asemKa.jalan();
//        asemKa.jalan();
//        asemKa.checkBahanBakar();
//        asemKa.checkBill();

        Skin skinDefault = new Skin("Default Skin", 3);
        Skill playerSkill = new Skill(5, 10, 15);
        Skill enemySkill = new Skill(6, 12, 18);

        Hero layla = new Hero("Layla", 3, 100, playerSkill, skinDefault);
        Hero miya = new Hero("Miya", 3, 100, enemySkill, skinDefault);
        System.out.println("HP Miya: " + miya.getHp());
        System.out.println("HP Layla: " + layla.getHp());

        System.out.println("Attack 1");
        layla.attack(miya);
        System.out.println("HP Miya: " + miya.getHp());
        System.out.println("HP Layla: " + layla.getHp());

        System.out.println("Attack 2");
        layla.attack(miya);
        System.out.println("HP Miya: " + miya.getHp());
        System.out.println("HP Layla: " + layla.getHp());

    }
}
