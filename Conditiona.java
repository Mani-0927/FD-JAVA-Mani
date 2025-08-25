import java.util.Scanner;

public class Conditiona {
    public void check() {
        Scanner sc = new Scanner(System.in); // Scanner object
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt(); // user input

        if (marks == 10) {
            System.out.println("O");
        } else if (marks == 9) {
            System.out.println("A+");
        } else if (marks == 8) {
            System.out.println("A");
        } else {
            System.out.println("Other grade");
        }

        sc.close(); 
    }

    public static void main(String[] args) {
        Conditiona c = new Conditiona();
        c.check();
    }
}
