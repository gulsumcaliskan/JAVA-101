
public class LabAssistant extends Assistant{
	
public LabAssistant(String nameSurname, String telephone, String email, String departmant, String degree, String officeHour){
        
        super(nameSurname, telephone, email, departmant, degree, officeHour);
    }
    
    
    public void attentTheLabs(){
        System.out.println(this.getNameSurname() + " attends the Labs.");
    }

}
