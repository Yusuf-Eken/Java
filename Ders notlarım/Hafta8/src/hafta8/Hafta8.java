
package hafta8;

import java.util.Random;
import java.util.Scanner;

public class Hafta8 {


    public static void main(String[] args) {
        
        //ÇOK BOYUTLU DİZİLER
        /*
        int dizi[][]=new int [3][4];
        int A[]=new int [10];
        byte B[][][]= new byte[2][3][4];
        
        //ORNEK 1
        int[]dizi1=new int[5];
        
        int matris[][]=new int [5][0];
        
        int a[][]={{1,2,3},{4,5,6}};
        
        System.out.println(a[1][0]);
        System.out.println(a[0][0]);
        System.out.println(a[1][1]);
*/
        //ORNEK 2
        //2x2 bir matris oluşturunuz elemanları kullanıcıdan alınsın matrisyel görünümde ekrana yazd.
  /*      
        int sayilar [][]=new int [2][2];
        System.out.println(sayilar.length);
        Scanner scan=new Scanner (System.in);
        for (int i = 0; i < sayilar.length  ; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                System.out.println("Matrise elemanları giriniz:");
                sayilar[i][j]=scan.nextInt();
            }
        }
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                System.out.print(sayilar[i][j]+" ");
            }
            System.out.println("");
        }
    */    
        //ORNEK 3
        //3x5 uzuunluklu matris oluşturunuz elemanlarına rastgele atansın(10-20) arasında 
        /*
        int matris1[][]=new int [3][5];
        Random nesne=new Random();
         
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                matris1[i][j]=nesne.nextInt(10)+10;
            }
        }
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.print(matris1[i][j]+" ");
            }
            System.out.println("");
        }
        */
        
        //ORNEK 4
        //3x5 uzuunluklu matris oluşturunuz elemanlarına rastgele atansın(10-20) arasında 2. satırını yazdırınız
        /*
        int matris1[][]=new int [3][5];
        Random nesne=new Random();
         
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {               
                matris1[i][j]=nesne.nextInt(10)+10;
                System.out.print(matris1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("2.Satırı yaz");
        //2. satırı yazdırma
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.print(matris1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("2.sutunu yaz");
        //2. sütunu yazdırma
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.print(matris1[i][j]+" ");
            }
            System.out.println("");
        }
        */
        //ORNEK 5
        //4X4 0 VE 1 LERDEN OLUŞAN MATRİS indexler eşit olduğunda 1 ata değilse 0 ata
        /*
        int matris[][]=new int[4][4];
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                if (i==j) {
                matris[i][j]=1;
                }
                else{
                matris[i][j]=0;
                }
                System.out.print(matris[i][j]+" ");
                }
            System.out.println("");
            }
        */
        //ORNEK 6
        //NxM uzunluklu tüm elemanları 1 olan matris oluşturun ekrana yazd.
        /*
        int n,m;
        Scanner oku=new Scanner(System.in);
        System.out.println("Satır Sayisini Giriniz:");
        n=oku.nextInt();
        System.out.println("Sütun Sayisini Giriniz:");
        m=oku.nextInt();
        int matris[][]=new int[n][m];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j]=0;
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
            }
        */
        
        //KALP ÇİZ 20X20
        int kalp[][]=new int[20][20];
        for (int i = 0; i < kalp.length; i++) {
            for (int j = 0; j < kalp[0].length; j++) {
                kalp[i][j]=0;
                if (i==6&&j==4) {
                kalp[i][j]=1;}
                else if (i==7&&j==4) {
                kalp[i][j]=1;}
                else if (i==5&&j==5) {
                kalp[i][j]=1;}
                else if (i==4&&j==6) {
                kalp[i][j]=1;}
                else if (i==4&&j==7) {
                kalp[i][j]=1;}
                else if (i==5&&j==8) {
                kalp[i][j]=1;}
                else if (i==6&&j==9) {
                kalp[i][j]=1;}
                else if (i==5&&j==10) {
                kalp[i][j]=1;}
                else if (i==4&&j==11) {
                kalp[i][j]=1;}
                else if (i==4&&j==12) {
                kalp[i][j]=1;}
                else if (i==5&&j==13) {
                kalp[i][j]=1;}
                else if (i==6&&j==14) {
                kalp[i][j]=1;}
                else if (i==4&&j==11) {
                kalp[i][j]=1;}
                else if (i==7&&j==14) {
                kalp[i][j]=1;}
                else if (i==8&&j==13) {
                kalp[i][j]=1;}
                else if (i==9&&j==12) {
                kalp[i][j]=1;}
                else if (i==10&&j==11) {
                kalp[i][j]=1;}
                else if (i==11&&j==10) {
                kalp[i][j]=1;}
                else if (i==8&&j==5) {
                kalp[i][j]=1;}
                else if (i==9&&j==6) {
                kalp[i][j]=1;}
                else if (i==10&&j==7) {
                kalp[i][j]=1;}
                else if (i==11&&j==8) {
                kalp[i][j]=1;}
                else if (i==12&&j==9) {
                kalp[i][j]=1;}
            System.out.print(kalp[i][j]+" ");

            }
                System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }


