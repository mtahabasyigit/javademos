import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Harf Giriniz: ");
        char harf = sc.next().charAt(0);


        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Sessiz harf girdiniz");
                break;
        }

    }
}