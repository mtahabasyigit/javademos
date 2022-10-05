import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //--------------Primitive Types--------------
        System.out.println("--------------Primitive Types--------------\n");

        //--------------Integer--------------
        System.out.println("-------byte-------");
        byte maxByte = 127;
        byte miniByte = -128;
        System.out.println("maxByte = "+ maxByte);
        System.out.println("miniByte = "+ miniByte);

        System.out.println("-------short-------");
        short maxShort = 32767;
        short miniShort = -32768;
        System.out.println("maxShort = "+ maxShort);
        System.out.println("miniShort = "+ miniShort);

        System.out.println("-------int-------");
        int max_int = 2147483647;
        int mini_int = -2147483648;
        System.out.println("max_int = "+ max_int);
        System.out.println("mini_int = "+ mini_int);

        System.out.println("-------long-------");
        //long sonuna L koyulması gerekiyor yoksa hata veriyor.
        long maxLong = 9223372036854775807L;
        long miniLong = -9223372036854775808L;
        System.out.println("maxLong = "+ maxLong);
        System.out.println("miniLong = "+ miniLong + "\n");

        String city = "Ankara";
        char character = 'A';

        //--------------Floating-point--------------

        float number1 = 1.2f;
        double number2 = 5.2;

        //--------------true or false boolean--------------

        //Scanner kullanıcıdan input almaya yarar.
        System.out.println("1. Sayıyı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();

        System.out.println("2. Sayıyı giriniz: ");
        Scanner scan2 = new Scanner(System.in);
        int sayi2 = scan.nextInt();

        System.out.println("3. Sayıyı giriniz: ");
        Scanner scan3 = new Scanner(System.in);
        int sayi3 = scan.nextInt();

        System.out.println("\n 1. Sayı : "+ sayi1 + "\n 2. Sayı : "+ sayi2 + "\n 3. Sayı : "+ sayi3+ "\n");

        boolean esitMi = (sayi1==sayi2);
        boolean esitMi2 = (sayi1==sayi3);


        System.out.println("1. sayı ve 2. sayı eşit mi?");
        System.out.println(esitMi);
        System.out.println("1. sayı ve 3. sayı eşit mi?");
        System.out.println(esitMi2);

        System.out.println("\n1. Sayıyı düzenleyiniz: ");
        Scanner scan4 = new Scanner(System.in);
        int sayi4 = scan.nextInt();

        sayi1 = sayi4;

        boolean esitMi3 = (sayi4==sayi2);

        System.out.println("\n1. sayı güncellendi\n 1. sayı = "+ sayi1 + "\n");
        System.out.println("Şimdi 1. sayı ve 2. sayı eşit mi?");
        System.out.println(esitMi3);




    }

}
