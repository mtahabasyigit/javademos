public class Main {

    public static void main(String[] args) {

        int sayi1 = 556;
        int sayi2 = 9832;
        int sayi3 = 1354;
        int enBuyuk = sayi1;


        if (enBuyuk<sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk<sayi3){
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: "+ enBuyuk);

    }
}