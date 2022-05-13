
public class Officer extends Personnel{
	
	private String departmant;
    	private String workingHour;
    
    public Officer(String nameSurname, String telephone, String email, String departmant, String workingHour){
        super(nameSurname, telephone, email);
        this.departmant = departmant;
        this.workingHour = workingHour;
    }
    
    
    public String getDepartmant(){
        return departmant;
    }
    
    public void setDepartmant(String departmant){
        this.departmant = departmant;
    }
    
    public String getWorkingHour(){
        return workingHour;
    }
    
    public void setWorkingHour(String workingHour){
        this.workingHour = workingHour;
    }
    
    public void work(){
        System.out.println("Officer " + this.getNameSurname() + ", is doing his/her duties.");
    }

}
