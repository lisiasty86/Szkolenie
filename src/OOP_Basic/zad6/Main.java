package OOP_Basic.zad6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(addProduct(10, "name1"));
        System.out.println(addCategory(10));

        List<String> productName = new ArrayList<>();
        List<Integer> productNumber = new ArrayList<>();
    }

    public static Product addProduct(int number, String name) {
        List<String> productName = new ArrayList<>();
        List<Integer> productNumber = new ArrayList<>();

        Product base = new Product();
        Product product = base.createProduct(number, name);
        productName.add(name);
        productNumber.add(number);
        return product;
    }

    public static Category addCategory(int number) {
        List<Integer> numberCategory = new ArrayList<>();

        Category category = new Category();
        numberCategory.add(number);
        return category;
    }



}
