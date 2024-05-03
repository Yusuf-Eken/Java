package hafta5;

import java.util.Random;
import java.util.Scanner;
import javax.sound.midi.Track;

public class Hafta5 {

    public static void main(String[] args) {
        int dizi[]={10,5,12,90,23,41,52,765,32};
        String isimler[]={"ayse","eren","furkan","yusuf"};
        
        //dizi.length Dizinin eleman sayısını verir.
        System.out.println(dizi.length);
        System.out.println(isimler.length);
        
        //Not:Diziler 0. index ile başlar.
        
        //Dizinin Hangi eleamnına ulaşmak istiyorsak kullancağımız şey:
        System.out.println(dizi[0]);
        
        //Diziler Arasında işlem yapılabiliyor:
        int top=0;
        top=dizi[2]+dizi[3];
        System.out.println("Toplam:"+top);
        
        //10 Elemanlı bir tam sayı dizisi tanımlayınız.
        int tamSayiDizisi[]=new int[10];
        //Not: İnt dizinin varsayılan sayısı 0.
        System.out.println(tamSayiDizisi[3]);
        
        //10 Elemanlı bir String dizisi tanımlayınız.
        String tamSayiDizisi1[]=new String[10];
        //Not: String dizinin varsayılan string i Null.
        System.out.println(tamSayiDizisi1[2]);
        
        //10 Elemanlı bir Bool dizisi tanımlayınız.
        boolean tamSayiDizisi2[]=new boolean[10];
        //Not: booelan dizinin varsayılanı i false.
        System.out.println(tamSayiDizisi2[2]);
        
        //10 Elemanlı bir char dizisi tanımlayınız.
        char tamSayiDizisi3[]=new char[10];
        //Not: char dizinin varsayılanı u055.
        System.out.println(tamSayiDizisi3[5]);
        System.out.println("");
        //İlk değer atama yöntemiyle oluşturulan diziyi döngü ile otomatik şekilde oluşturunuz.
        int b[]=new int[10];
        for(int i=0;i<b.length;i++){
            b[i]=i;
            System.out.println(b[i]);
        }
        System.out.println(b[4]);
        System.out.println("");
        int a[]={15,26,95,18,15,13,49,12,161,7,13};
        //a nın ilk ve son elemanını yazdırın.
        System.out.println(a[0]+" "+a[a.length-1]);
        //a nın ilk ve son elemanını toplayınız
        System.out.println(a[0]+a[a.length-1]);
        //a nın ilk ve son elemanını çarpınız
        System.out.println(a[0]*a[a.length-1]);
        
        System.out.println("");
        
        //5 Elemanlı elemanları ratgele sayılardan oluşan bir dizi oluşturunuz.

        int rastgeleSayi[]=new int[5];
        for (int i = 0; i < rastgeleSayi.length; i++) {
            rastgeleSayi[i]=(int)(Math.random()*10);
            
            System.out.println(rastgeleSayi[i]);
        }
        System.out.println("");
        //10-100 arasında oluştrun
        //(0-90)+10
        int sayi1=(int)(Math.random()*90)+10;
        System.out.println(sayi1);
        
        System.out.println("karabük");
        //5-25 arasında oluşturun
        //(0-20)+5
        int sayi2=(int)(Math.random()*20)+5;
        System.out.println(sayi2);
        System.out.println("");
        //Başka bir yöntem
        
        Random nesne=new Random();
        Scanner scn=new Scanner(System.in);
        
        int sayi3;
        
        sayi3=nesne.nextInt();
        System.out.println(sayi3);
        //Şartlı
        sayi3=nesne.nextInt(15);
        System.out.println(sayi3);
        
        System.out.println("");
        //Program:2 zar atsın sonuçlarını getiriniz.
        //zar1-1 2 3 4 5 6
        //zar2-1 2 3 4 5 6
        
        int zar1;
        zar1=nesne.nextInt(6)+1;
        int zar2;
        zar2=nesne.nextInt(6)+1;
        System.out.println(sayi3);
        System.out.println("1.Zar:"+zar1);
        System.out.println("2.Zar:"+zar2);
        
        
        //İstediğiniz uzunlukta bir dizi tanımlayın dizinin elamanlarını dizii indis değerlerinin 3 katının 2 fazlasını olacak şekilde oluşturunuz
        int soru1[]=new int[5];
        for (int i = 0; i < soru1.length; i++) {
            soru1[i]=(i*3)+2;
            System.out.println(soru1[i]);
        }
        System.out.println(soru1.length);
        
        System.out.println("");
        
        int yurt[]={10,20,20,10,10,20,5,20};
        int sayac[]= new int[yurt.length];
        for (int i = 0; i < yurt.length; i++) {
            for (int j = 0; j < yurt.length; j++) {
                if (yurt[i]==yurt[j]) {
                    sayac[i]++;
                }
            }
        }
        for(int x: sayac){
                System.out.print(x+" ");
            }
        System.out.println("");
        
        //1 den 10 a kadar döngü açın 6 oldugunda çıksın
        
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            if(i==6){
                break;
            }
        }
        System.out.println("6 oldu çık");

    }
    
}
