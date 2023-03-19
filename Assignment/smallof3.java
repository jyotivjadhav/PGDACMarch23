import java.util.*;
class smallof3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if (a<b){
if(a<c){
System.out.println("smallest number is"+a);
}
else{
System.out.println("smallest number is"+c);
}
}
if(b<c){
System.out.println("smallest number is"+b);
}
else{
System.out.println("smallest number is"+c);
}
}
}