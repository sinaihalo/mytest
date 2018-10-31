package clone;

public class MainClass {
public static void main(String[] args) {
	Experience experience = new Experience();
	experience.setExperience("2009-2013就读于家里蹲大学","精通JAVA,C,C++,C#等代码拷贝和粘贴");
	Resume zhangsan = new Resume("zhangsan","男",24,experience);
	zhangsan.setExperience(experience);  
    zhangsan.displayResume(); 
    //克隆对比，原型模式就是不想new对象
    Resume zhangsan2 = (Resume)zhangsan.clone();  
    Experience experience2 = (Experience) experience.clone();
    experience2.setExperience("2009-2013就读于家里蹲大学","精通JAVA,C,C++,C#");
    zhangsan2.setExperience(experience2);
    zhangsan2.displayResume();
    //克隆后对象打印比对；不是浅克隆复制引用，新增了一个对象
    zhangsan.displayResume();
    zhangsan2.displayResume();
}
}
