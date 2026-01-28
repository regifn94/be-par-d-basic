import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alas = scan.nextInt();
        int tinggi = scan.nextInt();
        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas Segitiga adalah : " + luas);
    }
}
