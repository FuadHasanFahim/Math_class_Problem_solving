import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Math_Problem_Solving {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter Your Number");
        double input = scanner.nextDouble();

        if ((input % 1) == 0) {
            System.out.println("It's a integer number");
        } else {
            System.out.println("It's a double number");
        }
    }

}
