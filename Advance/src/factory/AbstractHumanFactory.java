package factory;

public abstract class AbstractHumanFactory {
	public abstract <T extends Humam> T createHuman(Class<T> clazz);
}
