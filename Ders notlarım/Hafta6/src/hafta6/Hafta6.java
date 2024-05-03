package hafta6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hafta6 {

    public static void main(String[] args) {
        /*        
//Orn1 10 elemanlı elemanları indexin 2 katı olacak şekilde diziyi oluşturunuz. Oluşan diziyi ikinci yeni bir diziye kopyalayınız.
        
        int dizi1 []=new int [10];
        int dizi2 []=new int [10];
        
        for (int i = 0; i < dizi1.length; i++) {
                dizi1[i]=i*2;
                System.out.print(dizi1[i]+" ");
                
                //dizi2[i]=dizi1[i];
        }
        
        //Hangi diziyi kaçıncı indexten hangi diziye kaçıncı indexine kaç tane kopyalacağını yazıyoruz. ARRAYCOPY        
        System.arraycopy(dizi1, 0, dizi2, 0, dizi1.length);

        System.out.println("");
        for (int eleman:dizi2) {
            System.out.println(eleman+"");
        }
         */

        //Orn2: Verilen diziyi sıralayınız.(Küçükten büyüğe)
        //Sınav sorusu
////        int ek,yerdegistir,eindex=-1;
////        int dizi[]={599,10,50,30,40,60,90,78,49,25,16,263,28,19};
////        for (int i = 0; i < dizi.length-1; i++) {
////            ek=dizi[i];
////            for (int j = i+1; j < dizi.length; j++) {
////                if(dizi[j]<ek){
////                    ek=dizi[j];
////                    eindex=j;
////                }
////            }
////            if(eindex !=-1){
////             yerdegistir=dizi[i];
////             dizi[i]=dizi[eindex];
////             dizi[eindex]=yerdegistir;
////        }
////            eindex=-1;
////        }
////        for (int k :dizi){
////            System.out.println(k+"");
////        }
/*
        int ek,yerdegistir,eindex=-1,eb;
        int dizi[]={599,10,50,30,40,60,45,49,16,78,19191,1561,21,74};
        for (int i = 0; i < dizi.length-1; i++) {
            ek=dizi[i];
            eindex=i;
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[j]<ek){
                    ek=dizi[j];
                    eindex=j;
            }
            }
             yerdegistir=dizi[i];
             dizi[i]=dizi[eindex];
             dizi[eindex]=yerdegistir;
        }
        for (int k :dizi){
            System.out.println(k+"");
        }
         */
 /*
        int dizi[]={599,10,50,30,40,60,45,49,16,78,19191,1561,21,74};
        Arrays.sort(dizi);
        for (int k :dizi){
            System.out.println(k+"");
        }
         */
        //BUBBLE SORT
        /*
        int dizi[]={599,10,50,30,40,60,45,49,16,78,19191,1561,21,74};
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j < dizi.length - 1 - i; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    // Swap işlemi
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
        // Sıralanmış diziyi ekrana yazdırma
        for (int k : dizi) {
            System.out.print(k + " ");
        }
         */
 /*
        int dizi[]={3,4,12,9,2,5};
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]==12) {
                System.out.println(i+". indexte ve "+(i+1)+". Elemanda bulundu.");
                break;
            }
            
        }
        
        //BinarySearch çalıştırılmadan önce sorting yapmak zorundayız.
        
        Arrays.sort(dizi);
        int deger=Arrays.binarySearch(dizi, 12);
        System.out.println(deger+". indexte bulundu");
         */
 /*
        char dizi[]={'a','b','c'};
        char diz[]={'a','b'};
        boolean onay=true;
        if(dizi.length==diz.length){
            for (int i = 0; i < dizi.length; i++) {
                if (dizi[i]!=diz[i]) {
                    onay=false;
                    break;
                    }
                }
        }else{
                onay=false;
        }
        
        if(onay==true){
            System.out.println("Esit");
        }else{
            System.out.println("Esit Değil");
        }
         */
 /*
        char dizi[]={'a','b','c','d'};
        char diz[]={'a','b','c'};
         if(Arrays.equals(dizi, diz)){
             System.out.println("Esit");
         }else{
             System.out.println("Esit Degil");
         }
         */
        //İKİ BOYUTLU DİZİLER
        /*
        int matris[][]={{1,2},{3,6},{4,3}};
        
        System.out.println(matris.length); //Satır uzunluğu 
        
        System.out.println(matris[0].length); // Sütun uzunluğu
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println(matris[2][1]); // Elemana erişmek için bu şekilde kullanıyoruz.
         */
 /*
        int matris1[][]=new int[3][5];
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length;j++) {
                matris1[i][j]=1;
                System.out.print(matris1[i][j]+" ");
            }
            System.out.println("");
        }
         */
 /*
        int matris[][]=new int [10][10];
        int sayi;
        for (int i = 0; i < matris.length; i++) {
            sayi=i;
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j]=sayi;
                sayi++;
                System.out.print(matris[i][j]+" ");
            }
            System.out.println(" ");
        }
         */
 
 /*
         Random nesne=new Random();
         int matris1[][]= new int [3][2];
         int matris2[][]= new int [3][2];
         int matris3[][]= new int [3][2];

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                matris1[i][j]=nesne.nextInt(10);
                matris2[i][j]=nesne.nextInt(10);
                matris3[i][j]=matris1[i][j]*matris2[i][j];
            }
        }
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.print(matris1[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("");
           for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[0].length; j++) {
                System.out.print(matris2[i][j]+" ");
            }
               System.out.println(" ");
        }
           System.out.println("");
              for (int i = 0; i < matris3.length; i++) {
            for (int j = 0; j < matris3[0].length; j++) {
                System.out.print(matris3[i][j]+" ");
            }
                  System.out.println("" );
        }
*/

   /// n x m uzunluklu matris oluşturunuz elemanları 10  20 arasında oluşsun n m kullanıcıdan alınsın matrisi 5 ile toplayalım 
        Scanner nesne=new Scanner(System.in); 
        int n,m;
        System.out.println("Sütun sayısını giriniz:");
        n=nesne.nextInt();
        System.out.println("Satır sayısını giriniz:");
        m=nesne.nextInt();
        
        int matris[][]=new int [n][m];
        int matris1[][]=new int [n][m];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                Random nsn=new Random();
                matris[i][j]=nsn.nextInt(10);
                System.out.print(matris[i][j]+" ");
                matris1[i][j]=matris[i][j]+5;
            }
            System.out.println("");
        }
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.print(matris1[i][j]+" ");
            }
            System.out.println("");
        }
 
 //ARAŞTIRMA FOREACH İLE İKİ BOYUTLU DİZİ YAZDIRMA-----------------------------

    }

}
