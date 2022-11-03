package Testes.application;

import java.util.Locale;
import java.util.Scanner;
import Testes.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product  = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.next();
        System.out.println("Digite o preço: ");
        product.price = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
        product.quantity = sc.nextInt();

        product.totalValueInStock();

        product.addProducts(0);
        product.removeProduct(quantity:0);









        sc.close();
    }
}
