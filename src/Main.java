public class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = 15;
        boolean m = true;
        boolean n = false;

        System.out.println("-- Set A --");
        System.out.println(x > y && y == 15);
        System.out.println(y > x && y == 15);
        System.out.println(x <= 5 || y % 2 == 1);
        System.out.println(y < x || !(y == x));
        System.out.println(m && !n);
        System.out.println(!(m && n));

        System.out.println("- part 2 -");
        System.out.println((x > 2) && (x < 8));
        System.out.println(x > 3 && x < 6);
        System.out.println((x + 2 == 8) && m);
        System.out.println((x > 2) || (x % 2 == 1));
        System.out.println(x >= 7 || !m);
        System.out.println(!(x > 2));
        System.out.println(!(x > 7));
        System.out.println(x > 7);
        System.out.println("-- Set B --");

        boolean isRaining = false;
        double bank = 10.50;
        int minutes = 45;
        boolean shop;
        boolean stay;

        shop = (bank >= 8.00) && (minutes < 60) && !isRaining;
        System.out.println(shop);

        stay = !(bank > 5) || minutes > 30 || isRaining;
        System.out.println(stay);

        int score = 65;
        if (score < 0 || score > 100 || score % 2 != 0) {
            System.out.println("Illegal score");
        } else if (score >= 0 && score <= 100 && score % 2 == 0){
            System.out.println("Legal score");
        } else {
            System.out.println("Invalid!");
        }

        System.out.println("-- part 2 --");

        score = 80;
        if (score < 0 || score > 100 || score % 2 != 0) {
            System.out.println("Illegal score");
        } else if (score >= 0 && score <= 100 && score % 2 == 0){
            System.out.println("Legal score");
        } else {
            System.out.println("Invalid!");
        }

        String word = "Apple";
        if (!word.toLowerCase().equals("apple")) {
            System.out.println("beep!");
        } else {
            System.out.println("boop!");
        }
        System.out.println("-- Set C --");
        boolean a, b, c, d; // NOTE you can declare multiple
        // variables of same type like this
        a = false;
        b = !a;
        c = !(a || b);
        d = b && !(c && a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        a = false;
        b = false;
        c = true;
        if (a && b || c) {
            System.out.println("yes 1!");
        } else {
            System.out.println("no 1!");
        }

        if (a && (b || c)) {
            System.out.println("yes 2!");
        } else {
            System.out.println("no 2!");
        }

        if (c || b && a) {
            System.out.println("yes 3!");
        } else {
            System.out.println("no 3!");
        }

        if ((c || b) && a) {
            System.out.println("yes 4!");
        } else {
            System.out.println("no 4!");
        }

        System.out.println("--Set D--");
        int p = 10;
        int q = 13;
        boolean w = true;

        if ((p > 8) || (q < 10)) {
            int sum = p + q;
            System.out.println("Sum is: " + sum);
        }

        if (q == 13) {
            System.out.println("q is a 13!");
        }

        if (!(p < 8)) {
            System.out.println("p is NOT < 8!");
        }

        if (!(q + p > 25)) {
            int sum = p + q;
            System.out.println("sum NOT > 25!");
        }

        if (w) {
            System.out.println("w is true!");
        }

    }
}