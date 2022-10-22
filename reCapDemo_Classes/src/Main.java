public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int toplaSonuc = dortIslem.Topla(3,4);
        System.out.println(toplaSonuc);

        int cikarSonuc = dortIslem.Cikar(21,8);
        System.out.println(cikarSonuc);

        int carpSonuc = dortIslem.Carp(6,6);
        System.out.println(carpSonuc);

        int bolSonuc = dortIslem.Bol(50,5);
        System.out.println(bolSonuc);

    }
}