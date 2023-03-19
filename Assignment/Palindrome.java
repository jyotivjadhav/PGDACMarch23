import java.util.*;
class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,sum=0,rem,temp;
n=sc.nextInt();
temp=n;
while(n!=0){
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
System.out.println("reverse of number: "+sum);
if(temp==sum){
System.out.println("Number is palindrome");
}
else{
System.out.println("Number is not palindrome");	
}
}
}