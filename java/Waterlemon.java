// package test;
import java.util.Scanner;

public class cfWaterlemon {
    public static void main(String[] args) {
        Scanner inputObj    = new Scanner(System.in);
        int weight          = inputObj.nextInt();
        
        if (weight % 2 == 0 && weight != 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        inputObj.close();

    }
}
