package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad5 {

    public static void main(String args[])    {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = a<b ? a : b;
        int max = a>b ? a : b;
        System.out.println(min);
        System.out.println(max);
    }
}