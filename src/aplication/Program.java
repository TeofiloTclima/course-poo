package aplication;

import entitis.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products products = new Products();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        products.name = sc.nextLine();

        System.out.print("Price: ");
        products.price = sc.nextDouble();

        System.out.print("Quantity in Stock: ");
        products.quantity = sc.nextInt();



        System.out.println(products.toString());



        sc.close();
    }
}
