
package hafta4;

import java.util.Scanner;

public class Hafta4 {

    public static void main(String[] args) {
        /*
        int toplananİlkSayi=(int)(Math.random()*10),toplananİkinciSayi=(int)(Math.random()*10);
        
        System.out.println(toplananİlkSayi+"+"+toplananİkinciSayi+"?");
        int cevap;
        Scanner mat=new Scanner(System.in);
        cevap=mat.nextInt();
        while(true){
        if(cevap==(toplananİlkSayi+toplananİkinciSayi)){
            System.out.println("Tebrikler Bildiniz");
            break;
        }else{
            System.out.println("Yanlış Cevap.");
            System.out.println(toplananİlkSayi+"+"+toplananİkinciSayi+"?");
            cevap=mat.nextInt();
        }
        
        }
        */
        /*
        Scanner mat=new Scanner(System.in);
        int cevap,a,b,c=0;
        String rapor=" ",mesaj=" ";
        for (int i = 1; i <= 5; i++) {
            
            a=(int)(Math.random()*10);
            b=(int)(Math.random()*10);
            
            if(b>a){
                
                c=a;
                a=b;
                b=c;
            }
            System.out.println(a+"-"+b+"= ?");
            cevap=mat.nextInt();
            
        if(cevap==(a-b)){
            mesaj=a+" - "+b+" = "+cevap+" Doğru";
            }
        else{
            mesaj=a+" - "+b+" = "+cevap+" Yanlış";
                
            }

        rapor+=mesaj+"\n";
        }
        System.out.println(rapor);
        */
        
        /*
        int magicNum=(int)(Math.random()*10);
        int tahmin;
        int i=0;
        int sayac=1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Tahmininizi Giriniz:");
        tahmin=scn.nextInt();
        while(true){
            sayac++;
        if(magicNum>tahmin){
            System.out.println("Yukari");
            tahmin=scn.nextInt();
            if(sayac==3){
                break;
            }
            
        }
        
        else if(magicNum< tahmin){
            System.out.println("Asagi");
            tahmin=scn.nextInt();
             if(sayac==3){
                break;
            }
        }else{
             if(sayac==3){
                break;
            }
            break;
        }
        
        }
        if(tahmin==magicNum){
            System.out.println("Doğru bildiniz");
        }
        else if(sayac==3){
            System.out.println("Hakkınız bitti");
        }
*/
}
}


