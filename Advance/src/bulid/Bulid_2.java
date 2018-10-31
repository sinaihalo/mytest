package bulid;

public class Bulid_2 {

	private final int    age;
    private final int    safeID;
    private final String name;
    private final String address;
 
    public int getAge() {
        return age;
    }
 
    public int getSafeID() {
        return safeID;
    }
 
    public String getName() {
        return name;
    }
 
    public String getAddress() {
        return address;
    }
 
    public static class Builder {
        private int    age     = 0;
        private int    safeID  = 0;
        private String name    = null;
        private String address = null;
        // 构建的步骤
        public Builder(String name) {
            this.name = name;
        }
 
        public Builder age(int val) {
            age = val;
            return this;
        }
 
        public Builder safeID(int val) {
            safeID = val;
            return this;
        }
 
        public Builder address(String val) {
            address = val;
            return this;
        }
 
        public Bulid_2 build() { // 构建，返回一个新对象
            return new Bulid_2(this);
        }
    }
 
    private Bulid_2(Builder b) {
        age = b.age;
        safeID = b.safeID;
        name = b.name;
        address = b.address;
 
    }
    public static void main(String[] args) {
		
    	Bulid_2 ddc = new Bulid_2.Builder("Ace").age(10)
                .address("beijing").safeID(666).build();
    	System.out.println("name=" + ddc.getName() + "，age=" + ddc.getAge()
                + "，address=" + ddc.getAddress()+ "，safeId=" + ddc.getSafeID());
	}
}
