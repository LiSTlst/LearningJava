import java.util.Scanner;

public class PrimenumberOrNot{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number you want to test, than you will konw weather is it a primenumber.");
		int num=0,exitOrNot=0;
		boolean exit=false;
		while(!exit){
			num=scan.nextInt();
			boolean flag=true;
			double numSqrted=Math.sqrt(num);			
			if(num==1){
				flag=false;
			}else{
				for(int i=2;i<=numSqrted;i++){
					if(num%i==0){
						flag=false;
						break;
					}
				}
			}
			if(flag){
				System.out.println(num + " is a primenumber.");
			}else{
				System.out.println(num + " is not a primenumber.");
			}
			System.out.println("Continue or not?(1/0)");
			if((exitOrNot=scan.nextInt())==1){
				exit=false;
			}else{
				exit=true;
			}
		}
	}
}