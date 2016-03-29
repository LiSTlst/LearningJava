public class multiplicationTable{
  public static void main(String [] args){
    for(int i=1;i<10;i++){
      for(int j=1;j<10;j++){
        int k=i*j;
        if(i>=j){
          System.out.printf(i+"*"+j+"="+k+" ");
        }
        if(k<10){
          System.out.printf(" ");
        }
      }
      System.out.println("");
    }
  }
}
