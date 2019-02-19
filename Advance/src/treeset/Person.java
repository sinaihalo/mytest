package treeset;

public class Person implements Comparable<Person> {

	private String name;
    private int age;
    
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
        int num = this.age - o.age;                //年龄是比较的主要条件
        return num == 0 ? this.name.compareTo(o.name) : num;//姓名是比较的次要条件
    }
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
