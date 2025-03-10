package com.belajar.ramadhan;

import com.belajar.ramadhan.ecommerce.implementors.BukuDigital;
import com.belajar.ramadhan.ecommerce.implementors.BukuFisik;
import com.belajar.ramadhan.ecommerce.interfaces.IBook;
import com.belajar.ramadhan.factories.attributes.Transmition;
import com.belajar.ramadhan.factories.implementors.MPVImplementor;
import com.belajar.ramadhan.factories.implementors.SuvImplementor;
import com.belajar.ramadhan.factories.implementors.TruckImplementor;
import com.belajar.ramadhan.factories.models.Vehicle;

import java.beans.VetoableChangeListener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        Employee developer1 = new Developer("fukato@gmail.com", "123asik", "Fukato Nemo");
//        Employee hrd1 = new HRD("budiatmoko@gmail.com", "123asikbanget", "Budi Atmoko");
//
//        developer1.gajian(17000000);
//        System.out.println(developer1.getSalary());
//
//        hrd1.gajian(8000000);
//        System.out.println(hrd1.getSalary());
//
//        Farhan2025 farhan = new Farhan2025();
//        farhan.planA();
//        farhan.planB();
//        farhan.planC();

//        Transmition automaticTransmition = new Transmition(true);
//        Transmition manualTransmition = new Transmition(true);
//
//        Vehicle avanzo = new MPVImplementor();
//        avanzo.setTransmition(automaticTransmition);
//        avanzo.brake();
//        avanzo.throttle();
//
//        Vehicle fortunar = new SuvImplementor();
//        fortunar.setTransmition(manualTransmition);
//        fortunar.brake();
//        fortunar.throttle();
//
//        Vehicle hine = new TruckImplementor();
//        hine.setTransmition(manualTransmition);
//        hine.brake();
//        hine.throttle();

        BukuDigital bukuDilanDigital = new BukuDigital();
        BukuFisik bukuHarryPotter2 = new BukuFisik();

        bukuDilanDigital.read();
        bukuHarryPotter2.read();

        bukuDilanDigital.checkStock();
        bukuHarryPotter2.checkStock();

        bukuDilanDigital.checkSample();
        bukuHarryPotter2.checkSample();
    }
}
