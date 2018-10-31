package clone;

public class Resume implements Cloneable{
	private String name;  //姓名  
    private String sex;   //性别  
    private int age;      //年龄  
    private Experience experience; //工作经历  
      
    public Resume(String name, String sex, int age,Experience experience) {  
        this.name = name;  
        this.sex = sex;  
        this.age = age;  
        this.experience = new Experience();  
    }  
      
    public void setAge(int age) {  
        this.age = age;  
    }  
    public int getAge() {  
        return age;  
    }  
      
    public Experience getExperience() {  
        return experience;  
    }  
      
    public void setExperience(Experience e) {  
        this.experience = e;  
    }  
      
    public void displayResume() {  
        System.out.println("姓名："+name+" 性别："+sex+" 年龄:"+age);  
        System.out.println("工作经历："+experience.toString());  
    }
   public Object clone() {
    	 try {  
             return (Resume)super.clone();  
         } catch (Exception e) {  
             e.printStackTrace();  
             return null;  
         }  
    	
    }
    
}
