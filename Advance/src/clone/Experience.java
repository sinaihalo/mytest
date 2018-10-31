package clone;

public class Experience implements Cloneable {
	private String educationBackground;  
    private String skills;  
      
    public void setExperience(String educationBackground, String skills) {  
        // TODO Auto-generated constructor stub  
        this.educationBackground = educationBackground;  
        this.skills = skills;  
    }  
    public String toString() {  
        return educationBackground + skills;  
    } 
    public Object clone(){
    	try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
    }
}
