package com.belajar.ramadhan;

class Mobil {
    private String merk;
    private String warna;
    private BahanBakar bahanBakar;
    private Payment payment;

    public Mobil(BahanBakar bahanBakar, Payment payment) {
        this.bahanBakar = bahanBakar;
        this.payment = payment;
    }

    public void jalan() {
        this.bahanBakar.pakai(1);
        this.payment.increaseBill();
    }

    public void checkBahanBakar() {
        System.out.println(this.bahanBakar.getStock());
    }

    public void checkBill() {
        System.out.println(this.payment.getBill());
    }
}
