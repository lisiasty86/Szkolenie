package OOP_Basic.zad5;

import OOP_Basic.zad1.Employer;

public class Main {

    public static void main(String[] args) {

        Employer baseEmplyer = new Employer();
        Company baseCompany = new Company();


        Company company1 = baseCompany.createCompany("Coca-cola", "Warsaw", 20, baseEmplyer.createNewEmployes("Jacek", "Placek", 2000, 25));
        System.out.println(company1);
    }

}
