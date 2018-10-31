package faceinterface;

public class ClassA implements GodClass{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "ClassA [a=" + a + "]";
	}
	
}
