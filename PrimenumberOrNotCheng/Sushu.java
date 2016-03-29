import java.util.Scanner;

public class Sushu{
	public static void main(String[] args){  
		int i,x;
		double y;
		System.out.println("Enter the number(smaller than 10000)Attention:1 is not a primenumber:");
		Scanner scan=new Scanner(System.in);
		x=scan.nextInt();
		y=Math.sqrt(x);
		if(x==2){
			System.out.println("The number is a primenumber.");
		}else{
			for(i=2;i<=y;i++){
				if(x%i==0){
					System.out.println("The number is not a primenumber.");
				}
				break;
			}
		if(i>=y) System.out.println("The number is a primenumber.");
		}
	}
}