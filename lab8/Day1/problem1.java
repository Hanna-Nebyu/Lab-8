package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class problem1 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Double, Double, List<Double>> exp = (x,y)-> 
				{
			
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x*y);
			return list;
				};
		System.out.println(exp.apply(2.0, 3.0));
		}
}
					





	
		

