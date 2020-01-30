package Day1_problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductInfo {
	static enum SortMethod {BYPRICE, BYTITLE};
	
	public void sort(List<Product> prods, final SortMethod method) {
		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product P1, Product P2) {
				if(method == SortMethod.BYPRICE) {
					return P1.title.compareTo(P2.title);
				} else {
					if(P1.price == P2.price) return 0;
					else if(P1.price < P2.price) return -1;
					else return 1;
				}
			}
		}
		Collections.sort(prods, new ProductComparator());
	}
	
	public static void main(String[] args) {
		List<Product> prods = new ArrayList<>();
		prods.add(new Product("Pen", 20.75,99));
		prods.add(new Product("Apple", 39.56,77));
		prods.add(new Product("Candy", 34.78,56));
		prods.add(new Product("Book", 30.43,64));
		ProductInfo pi = new ProductInfo();
		pi.sort(prods, ProductInfo.SortMethod.BYTITLE); 
		System.out.println(prods);
		//same instance
		pi.sort(prods, ProductInfo.SortMethod.BYPRICE);
		System.out.println(prods);
	}
}
