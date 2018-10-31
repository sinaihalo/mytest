package decorater;

public abstract class DecoratorPerson implements Person{

	public Person person;
	public DecoratorPerson(Person dperson) {
		this.person = dperson;
	}
	public void getDress(){
		person.getDress();
	}
}
