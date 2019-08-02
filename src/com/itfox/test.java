package com.itfox;

import java.util.Random;

public class test {

    public static void main(String[] args) {
        int number = 0;
        Random random = new Random();
        String helper = "";
        for (int i=0; i<8; i++) {
            number = random.nextInt(9);
            helper = helper+number;
            System.out.println(number);
            System.out.println(helper);
        }
    }

}
