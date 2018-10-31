package decorater;

public class DecoratTest {

	public static void main(String[] args) {
		Person p = new WhitePerson();
		Person dp = new TshirtPerson(new BlackPerson());
		Person dp1 = new TshirtPerson(new WhitePerson());
		//DecoratorPerson dp2 = new TshirtPerson(new DecoratorPerson() );
		p.getDress();
		System.out.println("----------");
		dp.getDress();
		System.out.println("----------");
		dp1.getDress();

	}

}
