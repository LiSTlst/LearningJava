import java.util.*;

public class Isprime {
	static boolean judge(int n){
		if(n==2){
			return true;
		}
		if(n==1){
			return false;
		}
		double j=Math.sqrt(n);
		if(n>=2){
			for(int i=2;i<=j;i++){
				if(n%i==0) return false;
			}
		}
		return true;
	}
public static void main(String[] args){
	int n;
	boolean flag,exit;
	exit=true;
	while(exit){
	    Scanner in=new Scanner(System.in);
	    System.out.print("Please input an integer:");
	    n=in.nextInt();
	    flag=judge(n);
	    if(flag){
	    	System.out.println("It's a prime");
	    }else{
	    	System.out.println("It's not a prime");
	    }
	    System.out.println("Do you want to run the program again? Yes=1 No=0");
	    n=in.nextInt();
	    if(n==1){
	    	exit=true;
	    }else{
		    exit=false;
		    in.close();
	    }
	}
}