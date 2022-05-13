
public class Instructor extends Academician{
	
	private String doorNo;
    
    public Instructor(String nameSurname, String telephone, String email, String departmant, String degree, String doorNo){
        super(nameSurname, telephone, email, departmant, degree);
        this.doorNo = doorNo;
    }
    
    
    public String getDoorNo(){
        return doorNo;
    }
    
    public void setDoorNo(String doorNo){
        this.doorNo = doorNo;
    }
    
    public void joint(){
        System.out.println(this.getNameSurname() + " attended a senate");
        
    }
    
    public void examine(){
        System.out.println(this.getNameSurname() + " made an exam.");
    }
    

}
