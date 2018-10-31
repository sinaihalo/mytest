package decorater;

public class TshirtPerson extends DecoratorPerson {
	public TshirtPerson(Person dperson) {
		super(dperson);
	}
	@Override
	public void getDress() {
		person.getDress();
		setDress(person);
		
		
	}
	 void setDress(Person person) {
		 System.out.println("I am in Tshirt");
	}

}
