
public class University {
	public static void main(String[] args){
		
		Personnel p1 = new Personnel("Althea Yielding", "1141204231", "ayielding0@domainmarket.com");
//		p1.enter();
		
		Academician a1 = new Academician("Leonie Blues", "83249145133", "lblues1@ucoz.com", "CENG", "Associate Professor");
//		a1.giris();
		
		Officer o1 = new Officer("Charmine Bethune", "149163120247", "cbethune2@edublogs.org", "Information Processing Manager", "12:05:20");
	//	o1.cafeteria();
		
		Instructor i1 = new Instructor("Alida Guilleton", "24716766227", "aguilleton3@mozilla.com", "CENG", "PROF", "106");
	//	i1.giris();
//		i1.derseGir();
	//	System.out.println(i1.getKapiNo());
		
		Assistant as1 = new Assistant("Cherin Syddall", "19083241143", "csyddall4@usgs.gov", "CENG", "DR", "102");        
//      	as1.quizYap();
        
		LabAssistant la1 = new LabAssistant("Skyler Kirke", "39167223144", "skirke9@goo.ne.jp", ".CENG", "YL", "201");
//      	la1.lablaraGir();
        
        	InfoProcessing ip1 = new InfoProcessing("Gerty Schulter", "23357221107", "gschulter8@csmonitor.com", "Information Processing", "16:05:20", "Information Processing Secretary");
	//      ip1.networkInstallation();

		SecurityGuard sg1 = new SecurityGuard("Junina Parkins", "63202176120", "jparkins5@creativecommons.org", "Security Departmant", "20:05:20", "Security Guard Manager");       
	//      sg1.nobet();
        

	}

}
