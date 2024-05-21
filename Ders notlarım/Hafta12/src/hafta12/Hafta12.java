package hafta12;

import java.util.Random;
import java.util.Scanner;

public class Hafta12 {
//Soru 2:

    static int vergiHesapla(int sHacmi) {
//        Aralık kontrolüüne gerek yok çünkü else if kontrol ede ede gidiyor
        int vergi = 0;
        if (sHacmi < 1301) {
            vergi = 2000;
        } else if (sHacmi < 1600) {
            vergi = 3000;
        } else if (sHacmi < 1800) {
            vergi = 4000;
        } else if (sHacmi < 2000) {
            vergi = 5000;
        }
        return vergi;
    }
    
    public static double ikiSayiTopla(double a,double b){
        return a+b;
    }
    
    //Metot da static yoksa class üzerinden nesne açıyoruz ve nesne. ile bu metoda erişebiliyoruz.
    public double Topla(double a,int b){
        return a+b;
    }
    
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        /*
//Kullanıcının girdiği n sayısına göre n x n lik bir matris tanımlayın ve bu matrisi aşağıdaki örnekteki gibi doldurunn martisi matrisyel 
görünümde ekrana yazdırınız (20 puan) diğer soru sadece 1 ile başlatmış
        int n=giris.nextInt();
        int [][]matris=new int[n][n];
        int baslangic=0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++){
                matris[i][j]=baslangic;
                baslangic++;
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
         */
//Otomobilin silindir hacmine göre yıllık taşıt vergisini aşağıdaki tabloya göre hesaplayan vergiHesapla metodunu yazdınız.Public int        vergiHesapla(int sHacmi) metod imzası bu şekildedir Ana Programdan gerekli bilgileri girerek vergiyi yazdırınız. diğer soruda voidli bir şekilde yapılmış ve Aralıklar değişmiş.(20 puan)
        /*
        System.out.println(vergiHesapla(1300));
         */
 /*
//Tek boyutlu istediğiniz uzunlukta bir dizi tanımlayın. Bu diziyi rastgele sayılar ile 10 dahil 100 hariç sayılar ile doldurunuz.
//Oluşan diziyi ekrana yazdırınız.(30 ouan)
//Dizinin elemanlarını çift sayıların adedini bulunuz ve kaç tane olduğunu ekrana yazdırınız. diğer soruda 10 ile 31 ve tek sayılar buldurdu.

int dizi[]=new int[10];
int sayac=0;
Random random = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=random.nextInt(10,100);
            System.out.print(dizi[i]+" ");
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0) {
                sayac++;
            }
        }
        System.out.println("");
        System.out.println("Dizinin İçerisindeki Çift sayıların adeti:"+sayac);
        */
 
//Kullanıcıdan alınan a ve b sayılarından a üssü b yi hesaplayınız ve sonuçlarını ekrana yazdırınız.(15 puan)
        /*
        System.out.println("Tam sayi giriniz: ");
         int a=giris.nextInt();
        System.out.println("Bir Üs giriniz: ");
         int b=giris.nextInt();
         int carpim=1;
        for (int i = 1; i <=b; i++) {
            carpim*=a;
        }
        System.out.println(a+"^"+b+"="+carpim);
        */

//Kullanıcıdan alınan x y ve z sayıları için t = x kök y kök ve z kök ü toplayınız ve sonucu ekrana yazdırınız(15 puan)
        /*
        double z=giris.nextInt();
        double x=giris.nextInt();
        double y=giris.nextInt();
        
        double t=Math.sqrt(x)+Math.sqrt(y)+Math.sqrt(z);
        System.out.println(t);
        */
        
        System.out.println(ikiSayiTopla(5.4, 5.8));
        Hafta12 nesne= new Hafta12();
        System.out.println(nesne.Topla(87, 98));
    }

}
