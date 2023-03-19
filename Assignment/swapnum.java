import java.util.*;
class swapnum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
System.out.println("before swaping value of a and b"+a+b);
a=a-b;
b=a+b;
a=b-a;
System.out.println("before swaping value of a and b"+a+b);

}
}