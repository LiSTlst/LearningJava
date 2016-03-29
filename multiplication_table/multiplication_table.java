public class multiplication_table{
  public static void main(String [] args){
    int square[][]=new int[11][11];
    for(int i=1;i<11;i++){
      square[i][0]=i;
      for(int j=1;j<11;j++){
        square[0][j]=j;
        square[i][j]=square[i][0]*square[0][j];
      }
    }
    for(int i=0;i<11;i++){
      if(i==0){
        System.out.printf("*"+" "+" "+" ");
        for(int j=1;j<11;j++){
          if(square[i][j]<10){
            System.out.printf(square[i][j]+" "+" "+" ");
          }else{
            System.out.printf(square[i][j]+" "+" ");
          }
        }
      }else{
        for(int j=0;j<11;j++){
          if(square[i][j]<10){
            System.out.printf(square[i][j]+" "+" "+" ");
          }else if(square[i][j]<100){
            System.out.printf(square[i][j]+" "+" ");
          }else{
            System.out.printf(square[i][j]+" ");
          }
        }
      }
      System.out.println("|");
    }
  }
}
