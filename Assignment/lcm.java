import java.util.*;
class lcm{
public static void main(String args[]){
int a,b,max,lcm=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number a");
a=sc.nextInt();
System.out.println("Enter number b");
b=sc.nextInt();
max=(a>b)?a:b;
while(true){
if(max%a==0 && max%b==0){
lcm=max;
break;
}
max++;
}
System.out.println("Lcm="+lcm);
}
}