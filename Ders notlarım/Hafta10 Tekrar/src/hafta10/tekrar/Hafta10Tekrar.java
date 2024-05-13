
package hafta10.tekrar;

public class Hafta10Tekrar {

    static void adSoyadYasMeslek(String ad,String soyad,int yas,String meslek){
        System.out.println(ad+" "+soyad+" "+yas+" "+meslek);
}
    static void DortIslem(int s1,int s2,int s3){
        s3=s1+s2;
        System.out.println(s3);
        s3=s1*s2;
        System.out.println(s3);
        s3=s1/s2;
        System.out.println(s3);
        s3=s1-s2;
        System.out.println(s3);
    }
    static int Kare(int a){
        return a*a;
    }
    static int dkdrtgn(int a,int b){
        return a*b;
    }
    static double daire(int r,double pi){
        pi=3.14;
        return pi*(r*r);
    }
    static String karsilastirma(int a,int b){
        if (a>b) {
            return (a+">"+b);
        }
        else if (a<b) {
            return (a+"<"+b);
        }
        else{
            return(a+"="+b);
        }
    }
    
    static void harfNot(int n1,int n2){
    int ortalama=(n1+n2)/2;
        if (ortalama>30 && ortalama<=50) {
            System.out.println("FF");
        }if(ortalama>50 && ortalama<=70){
        System.out.println("DD");
    }
        if (ortalama>70 && ortalama<=90) {
            System.out.println("CC");
        }
        if (ortalama>90 && ortalama<=100) {
            System.out.println("AA");
        }
}
    public static void main(String[] args) {
//Kişisel Bilgiler: Ad, soyad, yaş ve meslek alanlarını parametre olarak alan ve 
//bu bilgileri kullanarak bir metin oluşturup ekrana yazdıran bir method yazın.
        adSoyadYasMeslek("Yusuf", "Eken", 22, "Yazılım Mühendisi");
//Dört İşlem: Üç adet int parametre alan (sayı1, sayı2, işlem) ve bu parametrelere göre toplama, çıkarma, çarpma ve bölme işlemlerini 
//gerçekleştiren ve sonucu geri döndüren bir method yazın. İşlem parametresi (+, -, *, /) değerlerini alabilir.
        DortIslem(5, 6, 8);
//        
//Alan Hesaplama: Bir karenin, dikdörtgenin veya çemberin alanını hesaplayan üç adet method yazın.
//Her method, gerekli kenar uzunluklarını parametre olarak almalı ve alanı geri döndürmelidir.
System.out.println(Kare(5));

System.out.println(dkdrtgn(5, 6));

System.out.println(daire(5, 3.14));

//İki int parametre alan ve bu parametreleri karşılaştırarak hangisinin daha büyük, küçük veya eşit olduğunu belirleyen bir method yazın. 
//Method, sonucu büyük, küçük veya eşit olarak belirten bir String değeri geri döndürmelidir.

        System.out.println(karsilastirma(5, 4));
        
//Bir öğrencinin sınav notlarını (yazılı, sözlü) parametre olarak alan ve bu notlara göre ortalama 
//puanı hesaplayan ve harf notunu (AA, BA, BB, CB, CC, ...) belirleyen bir method yazın.

        harfNot(15, 89);
    }
    
}
