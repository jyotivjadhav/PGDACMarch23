import java.util.*;
class sumdigitnum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,rem,sum=0;
n=sc.nextInt();
while (n>0){
rem=n%10;
System.out.println(rem);
sum=sum+rem;
n=n/10;
}
System.out.println("sum: "+sum);
}
}