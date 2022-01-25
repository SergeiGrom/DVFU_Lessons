package ru.dvfu.mrcpk.examples.example_05;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger numI1, numI2, bigNumI;
        BigDecimal numD1, numD2, bidNumD;
        numI1 = BigInteger.valueOf(1000000000);
        numI2= BigInteger.valueOf(20000000);
        bigNumI= BigInteger.valueOf(1);
        for (int i=0; i<1000000000;i++)
            bigNumI=bigNumI.add(numI1.multiply(numI1).multiply(numI1));
        System.out.println("numI1= " +bigNumI);

    }

}
