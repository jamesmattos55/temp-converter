import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean beginProgram;
        
        beginProgram = input.nextBoolean();
        if (beginProgram) {
            boolean goAgain;
            
            do {
                double celsius;
                double fahrenheit;
                
                fahrenheit = input.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(celsius);
                goAgain = input.nextBoolean();
            } while (goAgain);
        }
    }
}
