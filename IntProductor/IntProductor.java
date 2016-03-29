public class IntProductor{
	public static void main(String [] args){
		int[] randomNumbers=new int[100];
		for(int i=0;i<100;i++){
			randomNumbers[i]=((int)(Math.random()*10000%10000));
		}
		for(int i=0;i<100;i++){
			for(int j=0;j<i;j++){
				if(randomNumbers[i]<randomNumbers[j]){
					int temp=randomNumbers[i];
					randomNumbers[i]=randomNumbers[j];
					randomNumbers[j]=temp;
				}
			}
		}
		for(int i=0;i<100;i++){
			System.out.print(randomNumbers[i]+", ");
		}
	}
}