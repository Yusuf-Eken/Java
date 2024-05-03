
package ornek1;


public class Ornek1 {

    public static void main(String[] args) {
        
        int a=5;
        int b=a;
        System.out.println("Melih"+a);   
        //ORN2
        String ad="Eren";
        int al=5;
        int c=a;
        System.out.println("*********************");
        System.out.println(ad);
        System.out.println(al);
        System.out.println(c);
        System.out.println("*********************");
        //ORN3
        int z=1 ;
        System.out.println(z);
        z = z+5;
        System.out.println(z);
        z+=4;
        System.out.println(z);
        z*=2;
        System.out.println(z);
        System.out.println("*********************");
        //ORN4
        int g=10,p=2,k=100,m=40;
        g+=5;
        k-=25;
        p*=2;
        m/=10;
        System.out.println(g);
        System.out.println(p);
        System.out.println(k);
        System.out.println(m);
        System.out.println("*********************");
        //ORN5
        int s1=3,s2=5;
        // hep sağdan sola atanır.
        int o=s1=s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(o);
        System.out.println("*********************");
        //ORN6 iki sayının yerini değiştiriniz.
        int x=10,y=5,v;
        v=x;
        x=y;
        y=v;
        System.out.println(y);
        System.out.println(x);
        System.out.println("*********************");
        //ikinci yol
        int d1=10,d2=5;
        d1=d1+d2;
        d2=d1-d2;
        d1=d1-d2;
        System.out.println(d2);
        System.out.println(d1);
        System.out.println("*********************");
        //ORN7
        int a2=10;
        int a1=6;
        System.out.println(a2>a1);
        boolean sonuc;
        sonuc=a2<a1;
        System.out.println(sonuc);
        System.out.println("*********************");
        //ORN8
        int x1=10;
        int y99=16;
        if(x1>y99)
            System.out.println("x y den buyuk");
        else
            System.out.println("x y den kucuk");
        System.out.println("*********************");
        //ORN9 if li yapıda 2 çıktı verir
        int e1=2;
        int e2=2;
        if(e1==e2)
            System.out.println("a b esittir");
        if(e1!=e2)
            System.out.println("a b esit degildir");
        if(e1>e2)
            System.out.println("a b den buyuk");
        if(e1>=e2)
            System.out.println("a b den buyuk veya esit ");
        /*
        else if yapıda tek bir çıktı alır
        int e1=2;
        int e2=2;
        if(e1==e2)
            System.out.println("a b esittir");
        else if(e1!=e2)
            System.out.println("a b esit degildir");
        else if(e1>e2)
            System.out.println("a b den buyuk");
        else if(e1>=e2)
            System.out.println("a b den buyuk veya esit ");
        */
        System.out.println("*********************");
        //ORN10
        int a4= 8,a6=5;
        System.out.println("Toplam:"+(a4+a6));
        System.out.println("Fark:"+(a4-a6));
        System.out.println("Carp:"+(a4*a6));
        System.out.println("Bol:"+((double)a4/a6));
        System.out.println("Mod:"+(a4%a6));
        
        int t1=40, t2=6;
        System.out.println("Mod:"+t1%t2);
        
        int n1=40,n2=7;
        System.out.println(n1+"%"+n2+"="+n1%n2);
        System.out.println("*********************");
        //ORN 11
        int o1=10;
        int o2;
        o2=o1++;
        System.out.println("Sayi2:"+o2);
        System.out.println("Sayi1:"+o1);
        System.out.println("*********************");
        
        //ORN12
        
        int y1=20;
        int y2,y3,y4,y5,y6,y7;
        y2=++y1;
        y3=y1--;
        y4=--y1;
        y5=++y1;
        y6=y1++;
        y7=y1;
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
        System.out.println(y5);
        System.out.println(y6);
        System.out.println(y7);
        System.out.println("*********************");
        //XOR işlemi ^
        System.out.println(12^3);
        /*
        değişkenler ikili binary sistemine göre çekilir ve bu şekilde output alınır.
        0   1   |   1
        1   0   |   1
        0   0   |   0
        1   1   |   0 
        */
        System.out.println("*********************");
        //ORN13
        int v12,f11;
        
        v12=37;
        f11=60;
        double ort=(v12*40/100)+(f11*0.6);
        if(ort>=50){
            System.out.println(ort+" ile Gecti");
        }else{
            System.out.println(ort+" ile Kaldi");
        }        
        System.out.println("*********************");
        }
    }


