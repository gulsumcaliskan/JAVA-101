/*
Not Ortalaması Hesaplayan Program....
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan 
alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın. Aynı program içerisinde koşullu 
ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , 
küçük ise "Sınıfta Kaldı" yazsın.
Not : If ve Else kullanılmayacak...
*/


import java.util.Scanner;

public class NoteAverage {
    public static void main(String[] args) {
        
        int math, physic, chemistry, turkish, history, music;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Math note: ");
        math = input.nextInt();
        
        System.out.print("Physic note: ");
        physic = input.nextInt();
        
        System.out.print("Chemistry note: ");
        chemistry = input.nextInt();
        
        System.out.print("Turkish note: ");
        turkish = input.nextInt();
        
        System.out.print("History note: ");
        history = input.nextInt();
        
        System.out.print("Music note: ");
        music = input.nextInt();
        
        int total = (math + physic + chemistry + turkish + history + music);
        double ave = (total / 6.0);   
        
        boolean noteResult = (ave >= 60);
        
        String result = (noteResult) ? "Passed" : "Failed";
        
        System.out.print(ave + " with an average " + result);
    }
    
}
