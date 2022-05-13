
public class SecurityGuard extends Officer{
	
	private String document;
    
    public GuvenlikGorevlisi(String nameSurname, String telephone, String email, String departmant, String workingHour, String document){
        super(nameSurname, telephone, email, departmant, workingHour);
        this.document = document;
    }
    
    
    public String getDocument(){
        return document;
    }
    
    public void setDocument(String document){
        this.document = document;
    }
    
    public void guardDuty(){
        System.out.println(this.getNameSurname() + " did his/her guard duty.");
    }
    

}
