public class Count{
	private int serialNumber;
	public static int counter=0;
	public Count(){
		counter++;
		serialNumber=counter;
	}
	public int getserialNumber(){
		return serialNumber;
	}
}


public class Caculater(){
	public static void main(String[] args){
		Count myCount1;
		Count myCount2;
		myCount1=new Count();
		myCount2=new Count();
		System.out.println("serialNumber1 is"+myCount1.getserialNumber());
		System.out.ptintln("serialNumber2 is"+myCount2.getserialNumber());
	}
}
