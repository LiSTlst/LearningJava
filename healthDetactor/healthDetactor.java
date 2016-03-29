import java.util.Scanner;

class person{
  //int age=0;
  double weight=0.0,height=0.0;
  void outputDescript(){
    String condition="normal";
    double BMI=weight/(height*height);
    if(0 < BMI && BMI < 18.5){
      condition="too skin";
    }
    if(18.5 <= BMI && BMI <24.99){
      condition="nomarl";
    }
    if(18.5 <= BMI && BMI < 28){
      condition="fat";
    }
    if(28 <= BMI && BMI < 32){
      condition="too fat";
    }
    System.out.println("BMI is "+BMI+","+condition+".");
  }
}

public class healthDetactor{
  public static void main(String[] args){
    System.out.println("Enter data in the next line:");
    Scanner scan = new Scanner(System.in);
    person[] personFive=new person[5];
    for(int i=0;i<5;i++){
      personFive[i]=new person();
    }
    for(int i=0;i<5;i++){
      //personFive[i].name=scan.nextLine();
      personFive[i].weight=scan.nextDouble();
      personFive[i].height=scan.nextDouble();
      personFive[i].outputDescript();
      //System.out.println(personFive[i].name+"'s condition is "+personFive[i].outputDescript());
      //personFive[i].outputDescript(personFive[i].name);
      //System.out.println("You hava already enter this person's health data.Enter the next person's:");
    }
  }
}
