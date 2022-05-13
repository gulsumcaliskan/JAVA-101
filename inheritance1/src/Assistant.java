
public class Assistant extends Academician{
	
	private String officeHour;
    
    public Assistant(String nameSurname, String telephone, String email, String departmant, String degree, String officeHour){
        
        super(nameSurname, telephone, email, departmant, degree);
        this.officeHour = officeHour;
    }
    
    
    public String getOfficeHour(){
        return officeHour;
    }
    
    public void setOfficeHour(String officeHour){
        this.officeHour = officeHour;
    }
    
    public void quizOn(){
        System.out.println(this.getNameSurname() + ", Do quiz on.");
    }
    

}
