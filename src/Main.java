import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Kullanıcıdan veri almak için Scanner tanımlandı.
        Scanner imp = new Scanner(System.in);

        //Değişkenler tanımlandı
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Kullanıcıdan giriş al
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = imp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = imp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = imp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = imp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = imp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = imp.nextInt();


        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double notOrt = toplam / 6.0;
        System.out.println("Not Ortalamanız : " +notOrt);

        // Not ortalaması 60'dan büyük ise Geçti, küçük ise Kaldı.
        String sonuc = notOrt>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
