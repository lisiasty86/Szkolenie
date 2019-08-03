package OOP_Basic.zad6;

public class Category {

    int number;

    private Category(int number) {
        this.number = number;
    }

    public Category() {

    }

    public Category addCategory(int number) {
        return new Category(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Category{" +
                "number=" + number +
                '}';
    }
}
