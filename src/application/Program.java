package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.println("Product name: ");
		product.setName(sc.nextLine());
		System.out.println("Product Price:");
		 product.setPrice(sc.nextDouble());
		System.out.println("Quantity in stock: ");
		product.setQuantity(sc.nextInt());
		
		System.out.println(product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		

		System.out.println();
		System.out.println();
		System.out.println("Updated data: " + product);
		
	
		
		
		
		
		
		
		sc.close();
		

	}

}
