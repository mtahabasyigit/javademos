import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bir not giriniz: ");
        Scanner scan = new Scanner(System.in);
        char grade = scan.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");


        }

    }
}