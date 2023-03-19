import java.util.*;
class digitnum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,rem;
n=sc.nextInt();
while (n>0){
rem=n%10;
System.out.println(rem);
n=n/10;
}
}
}