package com.belajar.ramadhan.ecommerce.implementors;

import com.belajar.ramadhan.ecommerce.interfaces.IBook;
import com.belajar.ramadhan.ecommerce.interfaces.ISample;

public class BukuDigital implements IBook, ISample {
    @Override
    public void read() {
        System.out.println("YES BISA DIBACA DITABLET");
    }

    @Override
    public void borrow() {
        System.out.println("GA BISA DIPINJAM");
    }

    @Override
    public void retur() {
        System.out.println("GA BISA DIRETUR");
    }

    @Override
    public void checkStock() {
        System.out.println("TIDAK MEMILIKI STOCK");
    }

    @Override
    public void checkSample() {
        System.out.println("BISA CHECK SAMPLE");
    }
}
