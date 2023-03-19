import java.util.*;
import java.lang.*;
class EvenOdd{
public static void main(String args[]){
int n;
System.out.println("enter a number");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
System.out.println("number"+n);
if(n%2==0){
System.out.println("given number is Even");
}
else{
System.out.println("given number is Odd");
}
}
}