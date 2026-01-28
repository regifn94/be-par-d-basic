import java.util.Scanner;

public class CountGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai anda : ");
        int nilai = input.nextInt();

        int absent = input.nextInt();
        if(absent > 7){
            System.out.println("WF");
            return;
        }

        if(nilai > 90){
            System.out.println("A");
        }else if(nilai >= 85){
            System.out.println("A-");
        }else if(nilai >= 81){
            System.out.println("B+");
        }else if(nilai >= 75){
            System.out.println("B");
        }else if(nilai >= 71){
            System.out.println("B-");
        }else if(nilai >= 68){
            System.out.println("C+");
        }else if(nilai >= 66){
            System.out.println("C");
        }else if(nilai >=60){
            System.out.println("C-");
        }
    }
}
