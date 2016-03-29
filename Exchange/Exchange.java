public class Exchange{
	public static void main(String[] args){
		String h="Hello";
		System.out.println("h="+h);
		String w=h;
		System.out.println("w="+w);
		w="world";
		System.out.println("new h="+h);
		System.out.println("new w="+w);
	}
}