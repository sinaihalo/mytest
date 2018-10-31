package faceinterface;

public class ClassB implements GodClass{
	@Override
	public String toString() {
		return "ClassB [a=" + a + ", b=" + b + "]";
	}
	int a;
	int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
