package object;

class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company+ ","+ os;
	}

}


public class SmartPhoneExample{
	public static void main(String[] args) {
		SmartPhone myphone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj =myphone.toString();
		System.out.println(strObj);
		
		System.out.println(myphone);
	}
}
