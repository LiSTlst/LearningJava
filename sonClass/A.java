class B{
	public int a=10;
	public static int b= 10;
	protected int c=30;
	public static int getB(){
		return b;
	}
}

public class A{
	public static void main(String args[]){
		System.out.println(B.b);
		//B a = new B();
		//System.out.println(a.a);
		//System.out.println(a.b);
		//System.out.println(a.c);
		//System.out.println(a.getB());
		//System.out.println(B.getB());
	}
}