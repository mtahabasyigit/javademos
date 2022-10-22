public class Main {

    public static void main(String[] args) {

        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }

    //camelCasing
    public  static void sayiBulmaca(){

        int[] sayilar = new int[] {1,3,4,9,12,21};
        int aranacak = 4;
        boolean varMi = false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }

        String mesaj ="";
        if (varMi) {
            mesaj = "Sayı mevcuttur: "+aranacak;
            mesajVer(mesaj);
        }else {
            mesajVer("Sayı mevcut değildir: "+aranacak);
        }

    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }

}