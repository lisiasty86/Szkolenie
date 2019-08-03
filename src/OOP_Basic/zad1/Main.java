package OOP_Basic.zad1;

public class Main {

    public static void main(String[] args) {

        Employer base = new Employer();

        Employer employer1 = base.createNewEmployes("jacek", "placek", 2000, 20);

        System.out.println(employer1);
        //System.out.println(Employer.yearlySalary(employer1));
        employer1.yearlySalary();

    }

}
