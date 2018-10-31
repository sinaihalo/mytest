package process;

public class MemoryDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
        long mem1,mem2;
        Integer someints[] = new Integer[1000];
        System.out.println("Total memory is ：" + r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("Initial free is : " + mem1);
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection : " + mem1);
	}

}
