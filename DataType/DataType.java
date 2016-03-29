/*这是一段赋值语句*/
public class DataType{
	public static void main(String[] args){
		boolean flag;
		char yeschar;
		byte finbyte;
		int intvalue;
		long longvalue;
		short shortvalue;
		float floatvalue;
		double doublevalue;

		flag=true;
		yeschar='y';
		finbyte=30;
		intvalue=-7000;
		longvalue=2001;
		shortvalue=20000;
		floatvalue=9.997E-5f;
		doublevalue=floatvalue*floatvalue;

		System.out.println("The value are:");
		System.out.println("flag="+flag);
		System.out.println("finbyte="+finbyte);
		System.out.println("intvalue="+intvalue);
		System.out.println("longvalue="+longvalue);
		System.out.println("shortvalue="+shortvalue);
		System.out.println("floatvalue="+floatvalue);
		System.out.println("doublevalue="+doublevalue);
	}
}