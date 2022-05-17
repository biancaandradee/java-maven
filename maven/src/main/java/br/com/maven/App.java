package br.com.maven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.br.com.maven.model.Product;

public class App {

    private static Double totalCalculated(List<Product> list) {
        Double sumProducts = 0.0;

        for (Product p : list) {
            sumProducts += (p.getPrice() * p.getQuantity());
        }
        return sumProducts;
    }

    public static void main( String[] args ){

        Scanner sc = new Scanner(System.in);
  	    Integer prodQuantity = 0;
  	    String name = "";
  	    Double price;
  	    Integer currentProdQuantity;
  	
    System.out.print("Informe a quantidade de itens que deseja cadastrar: ");
    
    prodQuantity = Integer.parseInt(sc.nextLine());
    
    List<Product> productsList = new ArrayList<>();
    
    for (int i = 0; i < prodQuantity; i++) {

    	System.out.print("Digite a quantidade (> 0) do produto: ");
    	currentProdQuantity = Integer.parseInt(sc.nextLine());
    	
    	if (currentProdQuantity > 0) {
    		System.out.print("Digite o preço do produto: ");
      	    price = Double.parseDouble(sc.nextLine());
      	
      	    System.out.print("Digite o nome do produto: ");
      	    name = sc.nextLine();
      	
      	    productsList.add(new Product(name, price, currentProdQuantity));
    	} else {
    		System.out.println("Quantidade de produto inválido!");
    		i--;
    	}
    	
    }
    
    System.out.print("\n\nDeseja exibir lista dos produtos? [1 -> Sim / 2 -> Não]: ");
    switch(sc.nextInt()) {
    	case 1:
    		for (Product product: productsList) {
    			System.out.println(product);
    		}

    		System.out.println("Valor total: R$ " + totalCalculated(productsList));
    		break;
    	case 2:
    		System.out.println("Saindo...");
    		break;
    	default:
    		System.out.println("Opção inválida!");
    		break;
    }
    
    sc.close();
  }
}
