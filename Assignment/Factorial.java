import java.util.*;
class Factorial{
public static void main(String args[]){
int n,i=1,fact=1;
System.out.println("Enter a Number");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
while(i<=n){
fact=fact*i;
i++;
}
System.out.println("factoril: "+fact);
}
}	