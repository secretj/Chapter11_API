package object;

class Value {
	int value;
	
	public Value(int value) {
		this.value = value;
	}
}



public class ObjectOrg {
	public static void main(String[] args) {
		Value v1 =new Value(701021);
		Value v2 = new Value(701021);
		
		System.out.println(v1 instanceof Value);
		
		
		
	}

}
