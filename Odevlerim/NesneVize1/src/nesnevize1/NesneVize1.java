
package nesnevize1;

import java.util.Random;
import java.util.Scanner;

public class NesneVize1 {

    public static void main(String[] args){
        //Soru 1
        /*
        String[]mevsimler={"ilk","yaz","son","kış"};
        for (int i = 0; i < mevsimler.length; i++) {
            System.out.println(mevsimler[i]);
        }
        */
        //Soru 2
        /*
        Scanner scn=new Scanner(System.in);
        System.out.println("Bir Fiyat Giriniz:");
        double fiyat;
        double kdvlifiyat;
        fiyat=scn.nextDouble();
        if (fiyat>0 && fiyat<1000) {
            kdvlifiyat=fiyat+fiyat*20/100;
            System.out.println("Kdv:"+fiyat*20/100);
            System.out.println("Kdvli fiyat:"+kdvlifiyat);
        }
        else if(fiyat>=1000){
            kdvlifiyat=fiyat+fiyat*25/100;
            System.out.println("Kdv:"+fiyat*25/100);
            System.out.println("Kdvli fiyat:"+fiyat+fiyat*25/100);
        }
        */
        //Soru 3
        /*
        Scanner rnd=new Scanner(System.in);
        System.out.println("A giriniz:");
        int a=rnd.nextInt();
        System.out.println("B giriniz:");
        int b=rnd.nextInt();
        int carpim=1;
        for (int i = 1; i <= b; i++) {
            carpim*=a;
        }
        System.out.println(a+"^"+b+"="+carpim);
        */
        //Soru 4
        /*
        int dizi[]=new int[100];
        int top=0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(i+1);
            top+=dizi[i];
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");
        System.out.println("Toplam:"+top);
        System.out.println("ortalama:"+top/100.0);
        */
        //Soru 5
        /*
        Scanner scn=new Scanner(System.in);
        Random nesne=new Random();
        int n=scn.nextInt();
        int[][] matris = new int [n][n];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j]=nesne.nextInt(10);
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
        */
        //B kitapçığı
        //A kitapçığı
        //Soru 1
        /*
        Scanner scn=new Scanner(System.in);
        String[] gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
        int n=scn.nextInt();
        for (int i = 0; i < gunler.length; i++) {
            if (n==1) {
                System.out.println(gunler[0]);
            }
            if (n==2) {
                System.out.println(gunler[1]);
            }
            if (n==3) {
                System.out.println(gunler[2]);
            }
            if (n==4) {
                System.out.println(gunler[3]);
            }
            if (n==5) {
                System.out.println(gunler[4]);
            }
            if (n==6) {
                System.out.println(gunler[5]);
            }
            if (n==7) {
                System.out.println(gunler[6]);
            }
        }
        */
        
        //Soru 2
        /*
        Scanner scn=new Scanner(System.in);
        int v,f;
        v=scn.nextInt();
        f=scn.nextInt();
        double ort=(v+f)/2.0;
        System.out.println(v);
        System.out.println(f);
        System.out.println(ort);
        if(ort>=60){
            System.out.println("Geçti");
        }else{
            System.out.println("Kaldın");
        }
        */
        //Soru 3
        /*
        Scanner scn=new Scanner(System.in);
        double n;
        double top=0
        n=scn.nextDouble();
        for (double i = 1; i <= n; i++) {
            System.out.println("Toplam"+top+=1/i);
        }
        */
        //Soru 4
        /*
        int dizi[]=new int[50];
        int baslangic=10,top=0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=baslangic;
            baslangic+=2;
            System.out.println(dizi[i]+" ");
            top+=dizi[i];
        }
        */
        //Soru 5
        /*
        Random scn=new Random();
        System.out.println("Sayi giriniz:");
        int n=scn.nextInt(9)+1;
        int m=scn.nextInt(9)+1;
        int matris[][]=new int[n][m];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j]=5;
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
