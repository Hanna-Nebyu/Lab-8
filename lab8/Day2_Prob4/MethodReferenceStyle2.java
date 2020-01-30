package Day2_Prob4;
import java.util.Arrays;
import java.util.stream.Stream;

public class MethodReferenceStyle2 {
    
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRIST"};        
        Arrays.sort(names, String::compareToIgnoreCase);
        ////for (String name : names) {
          //  System.out.println(name);
            Stream.of(names).forEach(System.out::println);
                   }
       
    }
