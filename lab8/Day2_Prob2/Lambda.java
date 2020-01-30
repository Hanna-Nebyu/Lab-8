package Day2_Prob2;
import java.util.function.Supplier;
public class Lambda {

	public static void main(String[] args) {
		Supplier<Double> rand = () -> Math.random();
		System.out.println(rand.get());

	}

}
