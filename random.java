/*
Not Ortalaması Hesaplayan Program....
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan 
alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın. Aynı program içerisinde koşullu 
ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , 
küçük ise "Sınıfta Kaldı" yazsın.
Not : If ve Else kullanılmayacak...
*/


import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        
        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();
        
        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();
        
        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();
        
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ort = (toplam / 6.0);   
        
        boolean notSonuc = (ort >= 60);
        
        String sonuc = (notSonuc) ? "Gecti" : "Kaldi";
        
        System.out.print(ort + " ortalaması ile " + sonuc);
    }
    
}
