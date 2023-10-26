import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a lowercase word: ");
        String word = myScanner.nextLine();
        String first = word.substring(0, 1);  // get first letter
        if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")) {
            System.out.println("Your word begins with a vowel");
        } else {
            System.out.println("Your word begins with a consonant");
        }

        myScanner.close();
    }
}

