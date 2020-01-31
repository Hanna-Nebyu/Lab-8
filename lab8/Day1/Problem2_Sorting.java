package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	final String title;
	public int getModel() {
		return model;
	}

	final double price;
	final int model;

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	public String title() {
		return title;
	}

	public Double price() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}
}

public class Problem2_Sorting {
	public static void main(String args[]) {
		List<Product> product = new ArrayList<>();
		product.add(new Product("Pen", 20.75,99));
		product.add(new Product("Apple", 39.56,77));
		product.add(new Product("Candy", 34.78,56));
		product.add(new Product("Book", 30.43,64));
		
		
		// Comparator to compare Price of products
		final Comparator<Product> PRICE_COMPARATOR = new Comparator<Product>() {
			@Override
			public int compare(Product t1, Product t2) {
				return t1.price().compareTo(t2.price());
			}
		};
		
		// Comparator to compare product title
		final Comparator<Product> TITLE_COMPARATOR = new Comparator<Product>() {
			@Override
			public int compare(Product c1, Product c2) {
				return c1.title().compareTo(c2.title());
			}
		};
		
		// sorting objects using Comparator by price
		System.out.println("\nList of products, before sorting");
		System.out.println(product);
		
		Collections.sort(product, PRICE_COMPARATOR);
		System.out.println("\nSorting list by price");
		System.out.println(product);
		
		System.out.println("\nSorting list by title ");
		Collections.sort(product, TITLE_COMPARATOR);
		System.out.println(product);
			
		// Checking with more than one condition
		product.add(new Product("Candy", 34.78,57));
		product.add(new Product("Book", 30.43,62));
		System.out.println("\n if title is the same then by model"); //sorting using title and model
		product.sort((x, y) -> {
        if (x.title.equals(y.title)) {
            return x.model - y.model;
        } else {
            return x.title().compareTo(y.title());
        }
    });
		   System.out.println(product); 
	}
}
