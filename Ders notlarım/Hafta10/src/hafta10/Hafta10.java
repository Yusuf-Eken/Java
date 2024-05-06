
package hafta10;


public class Hafta10 {
        
    //ORNEK 1
    public static void ornek(){
            System.out.println("Metod Çalıştı");
        }
    
    //ORNEK 2
    public static void isimYaz(String isim,String x,String y){
        System.out.println("Merhaba"+isim);
        System.out.println("Merhaba"+x);
        System.out.println("Merhaba"+y);
    }
    
    //Ornek 3
    public static void isimDizisi(String [] dizi){
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
    }
    
    //Ornek 4
    public static void isimYasYaz(String a,int yas) {
        System.out.println(a+ " "+yas+" yasındadir.");
    }
    
    //Ornek 5
    public static int onEkle(int sayi){
        int top;
        top=sayi+10;
        System.out.println("metod içinde:"+top);
        return top;
    }
    
    //Ornek 6
        public static int ikiSayiTopla(int c,int v){
        
            return c+v;
        }
        
    //Ornek 7
        public static void YasKontrol(int yas){
            if(yas<18){
                System.out.println("Erisim Engellendi. Biraz Büyü ve gel!!");
            }else{
                System.out.println("Erisim izni verildi. Yeterince Büyüksün!!");
            }
        }
        
        //Aşırı yüklenmiş Metodlar
    //Ornek 8
        static void topla(double a,double b){
            System.out.println(a+b);
        }
        
         static void topla(int a,int b){
            System.out.println(a+b);
        }
        static void topla(int a,double b){
            System.out.println(a+b);
        }
          static void topla(int a,int b,int c){
            System.out.println(a+b+c);
        }
          //Aşırı yüklenmiş Metodlarile çarpım
          //çarpma işlemi için 2 overload metod yazınız.
          //1.çarpma işlemi 2 tam sayıyı çarpsın ve sonucu maine göndersin
          //2.Çarpma işlemi 3 tam sayıyı çarpsın ve sonucu öaine göndersin.
          
          //topla işlemi için 2 overload metod yazınız.
          //2 tam sayıyı toplasın
          //2 string ifadeyi birleştirsin
          
    //Ornek 9 
                    //1.çarpma işlemi 2 tam sayıyı çarpsın ve sonucu maine göndersin
          static int carp(int a,int b){
              return a*b;
          }
                    //2.Çarpma işlemi 3 tam sayıyı çarpsın ve sonucu öaine göndersin.
          static int carp(int x,int b,int y){
              return x*b*y;
          }
                    //2 tam sayıyı toplasın
          static void top(int u,int o){
              System.out.println(u+o);
          }
                    //2 string ifadeyi birleştirsin
          static void top(String y,String l){
              System.out.println(y+l);
          }
          
    //Ornek 10
          static int kareAl(int sayi){
              return sayi*sayi;
          }
          static void kareAll(int sayi1){
              System.out.println(sayi1*sayi1);
          }
          
    public static void main(String[] args) {
        //METOD yalnızca çağırıldığında çalışan kod bloğudur
        //bir metoda parametre olarak veri gönderebilirsniz.
        //Metotlar fonksiyon olarak adlandırılan belirli aksiyonları gerçekleştirmek için kullanılırlar.
        //Metot isimleri genelde işlemleri çağrıştıran isimler olmalı.
        //bir kez tanımlayıp sonsuz kez çağırabiliceğimiz için hem işimizi kolaylaştırır hemde temiz kod yazmayı sağlar
        
        //VOİD dönen değer olmadığı zaman kullanılır.
        //Dönen değerler için Return kullanılır.
        
        //Static (VERİ TİPİ)(METHOD UN İSMİ)
        
        //Ornek 1
        ornek();
        
        //Ornek 2
        isimYaz("Yusuf", "Emre", "Mehmet");
        System.out.println("");
        
        //Ornek 3
        String dizi []={"Emre","Yusuf"};
        isimDizisi(dizi);
        System.out.println("");
        
        //Ornek 4
        isimYasYaz("Emre", 12);
        isimYasYaz("Furkan", 13);
        isimYasYaz("Kerim", 10);
        isimYasYaz("Seyit", 11);
        
        //Ornek 5
        //Return kullanılan metodlarda yazdırmak için sout un içine çağrılır.
        System.out.println("Mainin içinde:"+onEkle(19));
        
        //Ornek 6
        int t=ikiSayiTopla(10, 20);
        System.out.println("İki Sayinin Toplamı:"+t);
        
        //Ornek 7
        YasKontrol(45);
        
        
        //METOD LARIN AŞIRI YÜKLENMESİ
        //AYNI İSİMDE METODLARIN İMZALARI FARKLI OLMALIDIR
        //parametre sayısı
        //parametre sırası
        //parametre veritipi
        
        //Ornek 8
        //4 adet topla fonksiyonu hangisi kendisine uyarsa onu çalıştırır.
        
        topla(15.1, 11);
        
        topla(12.5, 15);
        
        topla(12, 17.5);
        
        topla(12, 15, 19);
        
        //Ornek 9
        System.out.println(carp(5, 6));
        System.out.println(carp(4, 2, 3));
        
        top("yus", "uf");
        top(8, 9);
        
        //Ornek 10
        System.out.println(kareAl(5));
        
        kareAll(6);
    } 
    
}
