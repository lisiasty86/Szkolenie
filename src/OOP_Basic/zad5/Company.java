package OOP_Basic.zad5;

import OOP_Basic.zad1.Employer;

public class Company {

    private String name;
    private String localization;
    private int numberOfEmployes;
    private Employer employer;

    Company () {

    }

    private Company (String name, String localization, int numberOfEmployes, Employer employer) {
        this.name = name;
        this.localization = localization;
        this.numberOfEmployes = numberOfEmployes;
        this.employer = employer;
    }

    public Company createCompany(String name, String localization, int numberOfEmployes, Employer employer) {
        return new Company(name, localization, numberOfEmployes, employer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public int getNumberOfEmployes() {
        return numberOfEmployes;
    }

    public void setNumberOfEmployes(int numberOfEmployes) {
        this.numberOfEmployes = numberOfEmployes;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", localization='" + localization + '\'' +
                ", numberOfEmployes=" + numberOfEmployes +
                ", employer=" + employer +
                '}';
    }
}
