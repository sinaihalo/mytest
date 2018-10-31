package factory;

public class FactoryTest {

	public static void main(String[] args) {
		AbstractHumanFactory ahf = new HumanFactory();
		BlackPeple blk = ahf.createHuman(BlackPeple.class);
		WhitePeople wht = ahf.createHuman(WhitePeople.class);
		blk.talk();
		wht.getColor();
	}
}
