package Evenfibonacci;


public class FibonacciSum {
   public static void main(String[] args) {
    double a=0;double b=1;long sum=0;
    
   do{
        //System.out.println(a);
        a=a+b;
        b=a-b;
        if(a%2==0)
        sum+=a;
    }while(a<4000000);
    System.out.println("sum="+sum);
    
   } 
}
