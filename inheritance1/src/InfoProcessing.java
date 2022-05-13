
public class InfoProcessing extends Officer{
	
private String duty;
    
    public BilgiIslem(String nameSurname, String telephone, String email, String departmant, String workingHours, String duty){
        super(nameSurname, telephone, email, departmant, workingHours);
        this.duty = duty;
    }
    
    
    public String getDuty(){
        return duty;
    }
    
    public void setDuty(String duty){
        this.duty = duty;
    }
    
    public void networkInstallation(){
        System.out.println(this.getNameSurname() + " did a network installation.");
    }
    
   
}
