package Day2_Prob2;

import java.util.function.Supplier;

public class Inner {
	public static void main(String[] args) {
		Supplier<Double> supplier = (new Inner()).new MySupplier();
		System.out.println(supplier.get());
	}
	
	class MySupplier implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}
		
	}
}