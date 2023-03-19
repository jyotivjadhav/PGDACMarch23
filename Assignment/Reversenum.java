import java.util.*;
class Reversenum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,sum=0,rem;
n=sc.nextInt();
while(n!=0){
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
System.out.println("reverse of number: "+sum);
}
}