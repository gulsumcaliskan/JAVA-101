public class Academician extends Personnel{
	
	private String departmant;
    	private String degree;
    
    public Academician(String nameSurname, String telephone, String email, String departmant, String degree){
        
        super(nameSurname, telephone, email);
        this.departmant = departmant;
        this.degree = degree;
    }
    
    
    public String getDepartmant(){
        return departmant;
    }
    
    public void setDepartmant(String departmant){
        this.departmant = departmant;
    }
    
    public String getDegree(){
        return degree;
    }
    
    public void setDegree(String degree){
        this.degree = degree;
    }
    
    public void attendTheClass(){
        System.out.println(this.getNameSurname() + " attended the class.");
    }

}
