
package hafta11;

import java.util.Random;
import java.util.Scanner;


public class Hafta11 {
    /*
    static void tekMiCiftMi(int sayi){
        if(sayi%2==0){
            System.out.println(sayi+" Çift sayidir.");
        }else{
            System.out.println(sayi+" Tek sayidir");
        }  
    }
    */
    
    /*
    static void negatifMiPozitifMi(int sayi1){
        if(sayi1<0){
            System.out.println(sayi1+" Negatif sayidir");
        }else if(sayi1>0){
            System.out.println(sayi1+" Pozitif sayidir");
        }else{
            System.out.println(sayi1+"0'a eşit");
        }
    }
    */
    
    /*
    static void diziEkranaYaz(int []dizi){
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i]+" ");
            }
    }
    */
    
    /*
    static int buyukOlaniCagir(int sayi,int sayi1){
        int buyuk;
        if (sayi>sayi1) {
            buyuk=sayi;
        }else{
            buyuk=sayi1;
        }
        return buyuk;
    }
    */
    
    /*
    static int kareAl(int a){
    int kareSonuc=a*a;
    return kareSonuc;
    }
    
    static int kupAl(int b){
    int kupSonuc=b*b*b;
    return kupSonuc;
    }
    */
    
    /*
    static void uzeriAl(int a,int b){
        int carpim=1;
        for (int i = 0; i < b; i++) {
            carpim*=a;
        }
        System.out.println(carpim);
    }
    */
    
    /*
    static int faktoriyelAl(int a){
        int faktoriyel = 1;
        for(int i = 1; i <= a; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }
    */
    
    
    static void matrisOlustur(int n, int m){
        int[][]matris=new int [n][m];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                Random nesne =new Random();
                matris[i][j]=nesne.nextInt(9)+1;
            }
        }
        matrisYazdir(matris);
        transpozYazdir(matris);
    }
    
    static void matrisYazdir(int [][]matris){
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    static void transpozYazdir(int [][]matris){
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
    
    
    
    public static void main(String[] args) {
        /*
    //Kullanıcıdan alınan sayının tek mi çift mi olduğunu yazan bir metod yazınız metodu mainden çağırın.
        Scanner scn=new Scanner(System.in);
        int sayi;
        sayi=scn.nextInt();
        tekMiCiftMi(sayi);
        */      
        
        /*
    //Kullanıcıdan alınan sayının Negatif mi pozitif mi olduğunu yazan bir metod yazınız metodu mainden çağırın.
        int sayi1;
        sayi1=scn.nextInt();
        negatifMiPozitifMi(sayi1);
        */
        
        /*
    //Mainde oluşturulan bir diziyi ekrana yazdıran bir metod yazınız. 
    //Mainde oluşturulan dizi rassal 10 elemanlı bir dizi olsun.
    //Metodu mainden çağırarak test edin
        Random nesne = new Random();
        int [] dizi=new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=nesne.nextInt(9)+1;
        }
        diziEkranaYaz(dizi);
       */
        
        /*
    //Parametre olarak aldığı 2 sayıdan büyük olanını çağrıldığı yere döneen metod yazınız    
        System.out.println(buyukOlaniCagir(98, 12));
        */
        
        /*
    //Parametre olarak aldığı sayının karesini alınız..
        System.out.println(kareAl(5));
        */
        
        /*
    //Parametre olarak aldığı sayının küpünü alınız 
        System.out.println(kupAl(5));
        */
        
        /*
    //a nın karesi ve b nin küpünü toplayıp hesaplayın. kullanıcıdan alınsın
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println(kareAl(a)+kupAl(b));
        */

        /*
    //Parametre olarak aldığın a ve b sayıları için a üssü b yi hesaplayan ve sonucu ekrana yazdıran metodu yazınız.
      uzeriAl(2, 3);
        */
        
        /*
    //Parametre olarak aldığı a sayısının faktoriyelini al.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int a = scan.nextInt();
        System.out.println(faktoriyelAl(a));
        */
        
        /* 
    //2 3 ve 4 ün faktoriyelini alın ve toplayın
        System.out.println(faktoriyelAl(2)+faktoriyelAl(3)*faktoriyelAl(4));
        */
    
    //n x m uzunluklu bir matrisin transpozesini hesaplayan metod yazınız. n ve m kullanıcıdan alınsın.
        matrisOlustur(2, 3);
             


























    }
    
}
