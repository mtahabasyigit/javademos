public class Main {

    public static void main(String[] args) {

        int ogrenciSayisi = 14;
        String mesaj = "Öğrenci Sayısı: ";

        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci Sayım: " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım: " + ogrenciSayisi);

        int yeniOgrenciSayisi = 7;
        String yeniMesaj = "Yeni Öğrenci Sayısı: ";
        String guncelSayi = "Güncel Sayı: ";

        System.out.println(yeniMesaj + yeniOgrenciSayisi);
        System.out.println(guncelSayi + (ogrenciSayisi+yeniOgrenciSayisi));

    }
}