package com.itfox;

public class ZadRek1 {


    public static String displayPhone(String S) {

        String removeSpaces = S.replaceAll("\\s", "");
        removeSpaces = removeSpaces.replaceAll("-", "");

        System.out.println(S + "\n");

        int b = removeSpaces.length();

        StringBuffer text = new StringBuffer(removeSpaces);

        for (int i = 0; i <= b; i++ ) {

            if (i%4 == 0) {
                b++;
                text.insert(i, " ");


            }

        } System.out.println(text);

        //String a = "cos";
        return text.toString();
    }


    public static void main(String[] args) {

                /**String S = "00-44 48 555--5 836154654";

                String removeSpaces = S.replaceAll("\\s", "");
                removeSpaces = removeSpaces.replaceAll("-", "");

                System.out.println(S + "\n");

                int b = removeSpaces.length();

                StringBuffer text = new StringBuffer(removeSpaces);

                for (int i = 0; i <= b; i++ ) {

                    if (i%4 == 0) {
                        b++;
                        text.insert(i, " ");
                        System.out.println(text);

                    }

                }*/

                String S = "00-44 48 555--5 836154654";
                ZadRek1.displayPhone(S);
    }
}
