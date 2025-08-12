// package java;
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input a number and print...
        System.out.print("Enter a number: ");
        int marks = sc.nextInt();
        System.out.println(marks);

        sc.close(); // good practice to close Scanner
    }
}
