package OOP_Basic.zad1;

public class Employer {

    private String name;
    private String surname;
    private int monthlySalary;
    private int age;

    public Employer() {

    }

    private Employer(String name, String surname, int monthlySalary, int age) {

        this.name = name.substring(0,1).toUpperCase() + name.substring(1);
        this.surname = surname.substring(0,1).toUpperCase() + surname.substring(1);
        this.monthlySalary = monthlySalary;
        this.age = age;

    }

    public Employer createNewEmployes(String name, String surname, int monthlySalary, int age) {
        if (name.length() >= 5 && surname.length() >= 5) {
            return new Employer(name, surname, monthlySalary, age);
        } else {
            System.err.println("Podales zbyt krotkie imie i/lub nazwisko");
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", monthlySalary=" + monthlySalary +
                ", age=" + age +
                '}';
    }

    public void yearlySalary() {
        int yearlySalary = this.monthlySalary * 12;
        System.out.println("Roczna pensja: " + this.name + " wynosi " + yearlySalary);
    }
}
