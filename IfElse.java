import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur anda : ");
        int umur = input.nextInt();
        if(umur >=17){
            System.out.println("boleh buat ktp!");
        }else if(umur >=6){
            System.out.println("boleh buat kartu pelajar!");
        }else{
            System.out.println("masih bocil!");
        }
    }
}
