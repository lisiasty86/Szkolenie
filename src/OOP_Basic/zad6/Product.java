package OOP_Basic.zad6;

public class Product {

    int number;
    String nameOfProduct;

    private Product(int number, String nameOfProduct) {
        this.number = number;
        this.nameOfProduct = nameOfProduct;
    }

    public Product() {

    }

    public Product createProduct(int number, String nameOfProduct) {
        return new Product(number, nameOfProduct);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "number=" + number +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                '}';
    }
}
