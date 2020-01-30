package Day2_Prob3;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceStyle1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
        
        fruits.forEach((name) -> System.out.println(name)); // with lambda expression

       
        fruits.forEach(System.out::println);  //  method reference
    }
}

