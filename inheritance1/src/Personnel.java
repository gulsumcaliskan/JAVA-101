
public class Personnel {
	
	private String nameSurname;
    	private String telephone;
    	private String email;
    
    public Personnel(String nameSurname, String telephone, String email){
        this.nameSurname = nameSurname;
        this.telephone = telephone;
        this.email = email;
    }
    
    
    public String getNameSurname(){
        return nameSurname;
    }
    
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    
    public String getTelephone(){
        return telephone;
    }
    
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
    public void entrance(){
        System.out.println(this.nameSurname + " made enter to University.");
    }
    
    public void checkOut(){
        System.out.println(this.nameSurname + " checked out to University.");
    }    
    
    public void cafeteria(){
        System.out.println(this.nameSurname + " enter a cafeteria.");
    }
    

}
