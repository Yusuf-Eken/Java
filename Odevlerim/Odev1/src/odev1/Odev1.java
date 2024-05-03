
package odev1;

import java.util.Scanner;


public class Odev1 {


    public static void main(String[] args) {
/*Ödev1: Not Ortalaması Hesaplayan Program
Matematik, Programlama, Veritabanı, Türkçe derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp, ekrana yazdırınız.
Ortalama 60'dan büyük veya eşit ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazdırınız.
*/
/*
   int mat,program,veri,turk;
   double ort;
   Scanner scn=new Scanner(System.in);
   System.out.println("Matematik dersinden aldığınız puanı giriniz:");
   mat=scn.nextInt();
   System.out.println("Programlama dersinden aldığınız puanı giriniz:");
   program=scn.nextInt();
   System.out.println("Veritabanı dersinden aldığınız puanı giriniz:");
   veri=scn.nextInt();
   System.out.println("Türkçe dersinden aldığınız puanı giriniz:");
   turk=scn.nextInt();
   ort=((double)mat+program+turk+(double)veri)/4;
   System.out.println("Ortalama Notunuz: "+ort);
   if(ort>=60){
       System.out.println("Sınıfı Geçti.");
   }else{
       System.out.println("Sınıfta Kaldı.");
   }
*/
/*Ödev2: KDV Tutarı Hesaplayan Program
Kullanıcıdan alınan fiyatın,  KDV ve KDV’li fiyatını hesaplayıp ekrana yazdırınız. Fiyat 
0 ve 1000 TL arasında ise KDV oranı %18, tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. 
*/
/*
    Scanner oku=new Scanner(System.in);
    System.out.println("Bir fiyat giriniz:");
    Double tutar;
    tutar=oku.nextDouble();
    if(tutar>0 && tutar<1000){
        System.out.println("Girdiginiz fiyatin 1000tl'den dusuk olmasindan dolayi %18KDV uygulanir KDV tutari "+tutar*18/100+" TL
        olup KDV'li fiyati su sekildedir:"+(tutar+tutar*18/100)+"TL");
    }else{
        System.out.println("Girdiginiz fiyatin 1000tl'den yuksek olmasindan dolayi %8KDV uygulanir KDV tutari "+tutar*8/100+" TL
        olup KDV'li fiyati su sekildedir:"+(tutar+tutar*8/100)+"TL");

    }
*/
/*Ödev3: Dairenin Alanını ve Çevresini Hesaplayan Program
Yarı çapı kullanıcıdan alınan dairenin alanını ve çevresini hesaplayan programı yazınız.
𝜋 sayısını = 3.14 alınız.
*/
/*
    Scanner cp=new Scanner(System.in);
    System.out.println("Alanini ve Cevresini hesaplayacaginiz dairenin yaricapini giriniz:");
    Double ycap,alan,cevr,pi=3.14;
    ycap=cp.nextDouble();
    alan=pi*ycap*ycap;
    cevr=2*pi*ycap;
    System.out.println("Girdiginiz degere gore dairenin alani:"+alan+"\nGirdiginiz degere gore dairenin cevresi:"+cevr+"\nPi sayisi 3.14 kabul edilmistir.");
*/
/*Ödev4: Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
    Scanner up=new Scanner(System.in);
    System.out.println("Yari cap giriniz:");
    double r,a,pi=3.14,formul;
    r=up.nextDouble();
    System.out.println("Merkez Acisi giriniz:");
    a=up.nextDouble();
    formul=(pi*(r*r)*a)/360;
    System.out.println("Yaricapi "+r+", merkez acisinin olcusu "+a+" olan daire diliminin alani:"+formul);
    }
    
}
