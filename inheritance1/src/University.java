
public class University {
	public static void main(String[] args){
		
		Calisan c1 = new Calisan("Althea Yielding", "1141204231", "ayielding0@domainmarket.com");
//		c1.giris();
		
		Akademisyen a1 = new Akademisyen("Leonie Blues", "83249145133", "lblues1@ucoz.com", "CENG", "Doçent");
//		a1.giris();
		
		Memur m1 = new Memur("Charmine Bethune", "149163120247", "cbethune2@edublogs.org", "Bilgi Iþlem Müdür", "12:05:20");
	//	m1.yemekhane();
		
		OgretimGorevlisi o1 = new OgretimGorevlisi("Alida Guilleton", "24716766227", "aguilleton3@mozilla.com", "CENG", "PROF", "106");
	//	o1.giris();
//		o1.derseGir();
	//	System.out.println(o1.getKapiNo());
		
		Asistan as1 = new Asistan("Cherin Syddall", "19083241143", "csyddall4@usgs.gov", "CENG", "DR", "102");        
//      as1.quizYap();
        
        LabAsistan la1 = new LabAsistan("Skyler Kirke", "39167223144", "skirke9@goo.ne.jp", ".CENG", "YL", "201");
//      la1.lablaraGir();
        
        BilgiIslem bi1 = new BilgiIslem("Gerty Schulter", "23357221107", "gschulter8@csmonitor.com", "Bilgi Iþlem", "16:05:20", "Bilgi Iþlem Sekreter");
//      bi1.networkKurulumu();
        
        GuvenlikGorevlisi gg1 = new GuvenlikGorevlisi("Junina Parkins", "63202176120", "jparkins5@creativecommons.org", "Güvenlik Departman", "20:05:20", "Güvenlik Görevlisi Müdür");       
//      gg1.nobet();
        

	}

}
