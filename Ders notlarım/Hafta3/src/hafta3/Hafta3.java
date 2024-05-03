
package hafta3;

import java.util.Scanner;


public class Hafta3 {


    public static void main(String[] args) {
        /*
        int sayi=5;
        while(sayi>0){
            System.out.println("Sayi Pozitif,degeri: "+sayi);
            sayi--;
        */
        /*
        while(true){
            System.out.println("Dongu icindeyiz");
            System.out.println("Dongu icindeyiz");
            System.out.println("Dongu icindeyiz");

            break;
        }
            System.out.println("Dongu Basi");
        */
        /*
        int i=10,j=0,k=0;
        while(i>j){
            System.out.println(i+">"+j);
            i-=2;
            j+=2;
            k++;
        }
        System.out.println(i+" Artik "+j+" den kucuk degil");
        System.out.println("Dongu "+k+" defa calisti");
        */
        /*
        int sayi=1;
        do{
            System.out.println("sayi:"+sayi);
            sayi--;
        }while(sayi<0);
        */
        /*
        int x=100,y=40,i=0;
        do{
            i++;
            System.out.println(x+">"+y);
            x-=5;
            y+=10;
            
        }while(x>y);
        System.out.println("Dongu su kadar calisti:"+i);
        */
        /*
        for(int i=0;i<100;i+=2){
            System.out.println(i);
        }
        for(int i=1;i<100;i+=5){
            System.out.println(i);
        }
        int i,j;
        for(i=0,j=10;i<j;i++,j--){
        System.out.println(i+"  "+j);
        }
        */
        /*
        //Java döngülller ile 0 dan girilen sayıya kadar olan sayılardan 3 ve 4 e tam bölünen sayıların ortalamasını hesaplayan program
        System.out.println("Sayi giriniz:");
        int sayi1;
        Scanner oku=new Scanner(System.in);
        sayi1=oku.nextInt();
        int top=0,sayac=0;
        float ort;
        for(int i=0;i<sayi1;i++){
            if(i%3==0&&i%4==0){
                top+=i;
                sayac++;
            }
            System.out.println(i);
        }
        System.out.println("Toplam "+top);
        System.out.println("Ortalama "+(top/(double)sayac));
        */
        /*Scanner oku=new Scanner(System.in);
        int sayi1;
        do{
        System.out.println("Sayi Giriniz: ");
        sayi1=oku.nextInt();
        System.out.println(sayi1);
        }while(sayi1!=1);
        */
        /*
        int sayi1;
        Scanner oku=new Scanner(System.in);
        while(true){
            System.out.println("Sayi Giriniz: ");
            sayi1=oku.nextInt();
            if(sayi1==0){
                break;
            }else{
                System.out.println(sayi1);
            }
        */
        int sayi1;
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi Giriniz: ");
        sayi1=oku.nextInt();
        for(int i=0;i<sayi1;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
