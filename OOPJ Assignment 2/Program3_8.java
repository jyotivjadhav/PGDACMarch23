import java.util.Scanner;
class Rational{
   public void Rational_add(double a,double b,double a1,double b1){
    
      double add=((a*b1)+(a1*b))/(b*b1);
      System.out.println("add: "+add);

   }
   public void Rational_sub(double a,double b,double a1,double b1){
      double sub=((a*b1)-(a1*b1))/(b*b1);
      System.out.println("sub: "+sub);
   }
   public void Rational_mul(double a,double b,double a1,double b1){
      double c=(a*a1);
      double d=(b*b1);
      System.out.println("mul: "+c/d);
    }
   public void Rational_div(double a,double b,double a1,double b1){
      double c=(a*b1);
      double d=(b*a1);
      System.out.println("div: "+c/d);
    }      
}

class Program3_8{
    public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         Rational r=new Rational();
         double a=sc.nextDouble();
         double b=sc.nextDouble();
         double a1=sc.nextDouble();
         double b1=sc.nextDouble();
         r.Rational_mul(a,b,a1,b1);
         r.Rational_div(a,b,a1,b1);
         r.Rational_add(a,b,a1,b1);
         r.Rational_sub(a,b,a1,b1);

    }
}


