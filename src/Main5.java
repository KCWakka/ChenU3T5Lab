import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive even number less than 100: ");
        int num = myScanner.nextInt();

        while (num < 0 || num % 2 == 1 || num >= 100) {
            System.out.println("No! I said a positive even number less than 100!");
            System.out.print("Try again: ");
            num = myScanner.nextInt();
        }

        System.out.println("See, that wasn't so hard!");
        myScanner.close();
    }
}

