
package ornek2;

import java.util.Scanner;

public class Ornek2 {


    public static void main(String[] args) {
        

        int a=7;
        if(a%2==0){
            System.out.println("Cifttir");
        }else{
            System.out.println("Tektir");
        }
        //ORN1
        int puan=88;
        if(puan>=50){
            System.out.println("Basarili");
        }else{
            System.out.println("Basarisiz");
        }
        //ORN2
        System.out.println("Not giriniz");
        Scanner nesne=new Scanner(System.in);
        int puann=nesne.nextInt();
        
        if(puann<50){
            System.out.println("Basarisiz");
        }else{
            System.out.println("Basarili");
        }
        //ORN3
        System.out.println("1. Sayiyi giriniz");
        Scanner scn=new Scanner(System.in);
        int sayi1=scn.nextInt();
        System.out.println("2. Sayiyi giriniz");
        int sayi2=scn.nextInt();
        if(sayi1>sayi2){
            System.out.println(sayi1+" Sayisi "+sayi2+" den buyuktur");
        }else if(sayi1==sayi2){
            System.out.println(sayi1+" ve "+sayi2+" birbirlerine esitler");
        }else{
            System.out.println(sayi1+" Sayisi "+sayi2+" den kucuktur");
        }
        //ORN4
        System.out.println("Notu giriniz");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>=85){
            System.out.println("AA");
        }else if(n>75){
            System.out.println("BB");
        }else if(n>60){
            System.out.println("CC");
        }else if(n>50){
            System.out.println("DD");
        }else if(n<=40){
            System.out.println("FF");
        }else{
            System.out.println("DD");
        }
        //ORN5
        System.out.println("Hizinizi giriniz");
        Scanner oku=new Scanner(System.in);
        int hiz=oku.nextInt();
        if(hiz>90){
            System.out.println("Radara Girdiniz");
            
            if(hiz>=90&&hiz<120){
                System.out.println("Cezaniz:15.000");
            }
            else if(hiz>=120&&hiz<140){
                System.out.println("Cezaniz:20.000 ");        
            }
            else if(hiz>140){
                System.out.println("GECMIS OLSUN DEVLETE BI AUDI ALICAKSIN");
            }
        }else{
            System.out.println("Hiziniz Stabil.");
        }
        System.out.println("Sicakligi giriniz:");
        Scanner temp=new Scanner(System.in);
        int s=temp.nextInt();
        if(s<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(s>=5 && s<15){
            System.out.println("Sinemaya Gidebilrisiniz");
        }else if(s>=15 && s<25){
            System.out.println("Piknige Gidebilirsiniz hava güzel");
        }else if(s>25){
            System.out.println("Yuzmeye gidebilirsiniz ");
        }
        int deger=7;
        switch(deger){
            case 1: case 3: case 5: case 7:
                System.out.println("Tek");break;
            case 2: case 4: case 6: case 8:
                System.out.println("Çift");break;
        }
        
        //Kullanıcıdan alınan 2 sayı için +-*/ işlemlerini switch case ile gerçekleştiriniz
        Scanner calc =new Scanner(System.in);
        System.out.println("Sayi Girin");
        int s1=calc.nextInt();
        System.out.println("Sayi Girin");
        int s2=calc.nextInt();
        char operator=calc.next().charAt(0);
        int sonuc=0;
        switch("toplama"){
            case "toplama":sonuc=s1+s2; 
                System.out.println(sonuc);
            break;
        }
        System.out.println("Final notunu giriniz");
        Scanner ort=new Scanner(System.in);
        int fnl=ort.nextInt();
        System.out.println("Vize notunu giriniz");
        int vze=ort.nextInt();
        double ortalama;
        ortalama=(vze+fnl)/2;
        if(ortalama>85){
            System.out.println("AA");
        }else if(ortalama>75){
            System.out.println("BB");
        }else if(ortalama>60){
            System.out.println("CC");
        }else if(ortalama>50){
            System.out.println("DD");
        }else if(ortalama>40){
            System.out.println("EE");
        }else{
            System.out.println("FF");
        }
        }
    }
/*        
        Scanner min=new Scanner(System.in);
        System.out.println("E sayisini Giriniz");
        int e=min.nextInt();
        System.out.println("D sayisini Giriniz");
        int d=min.nextInt();
        System.out.println("F sayisini Giriniz");
        int f=min.nextInt();
        
        if(e>d && e>f){
            if(d>f){
            }else{
                System.out.println("f<d<e");
            }
        }else if(d>e&&d>f){
            if(e>f){
            }else{
                System.out.println("f<e<d");
            }
        }else if(f>d&&f>e){
            if(d>e){
            }else{
                System.out.println("e<d<f");
            }
            }
*/