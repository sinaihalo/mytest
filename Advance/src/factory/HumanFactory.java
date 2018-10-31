package factory;

public class HumanFactory extends AbstractHumanFactory{
	@SuppressWarnings("unchecked")
	@Override
	public  <T extends Humam> T createHuman(Class<T> clazz){
		Humam hum = null;
		try {
			hum = (Humam) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (T) hum;
		
	}
}
