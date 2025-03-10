package com.belajar.ramadhan.ecommerce.implementors;

import com.belajar.ramadhan.ecommerce.interfaces.IBook;
import com.belajar.ramadhan.ecommerce.interfaces.ISample;

public class BukuFisik implements IBook, ISample {
    @Override
    public void read() {
        System.out.println("YES BISA DIBACA LANGSUNG");
    }

    @Override
    public void borrow() {
        System.out.println("YES BISA DIPINJAM LANGSUNG");
    }

    @Override
    public void retur() {
        System.out.println("YES BISA DIRETUR LANGSUNG");
    }

    @Override
    public void checkStock() {
        System.out.println("BISA CEK STOCK");
    }

    @Override
    public void checkSample() {
        System.out.println("GA BISA CHECK SAMPLE");
    }
}
