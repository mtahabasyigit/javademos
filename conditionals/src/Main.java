import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan_string = new Scanner(System.in);
        System.out.println("Adınızı Giriniz: ");
        String name1 = scan_string.nextLine();
        System.out.println("Hoş Geldin "+ name1 +"\n");


        System.out.println("Birinci sayıyı giriniz: ");
        Scanner scan_int = new Scanner(System.in);
        int sayi = scan_int.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scan_int.nextInt();

        if (sayi<sayi2){
            System.out.println("\n"+ sayi +" Sayısı "+ sayi2 +" sayısından küçük");
        }
        else if (sayi == sayi2) {
            System.out.println(sayi +" Sayısı "+ sayi2 +" sayısına eşit");
        }
        else {
            System.out.println(sayi +" Sayısı "+ sayi2 +" sayısından büyük");
        }


    }

}