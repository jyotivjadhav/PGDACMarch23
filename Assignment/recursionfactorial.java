import java.util.*;
class recursionfactorial{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int i=1,fact=1,num,factorial;
System.out.println("Enter a Number");
num=sc.nextInt();
factorial=fact(num);
System.out.println("factorial is: "+factorial);
}
public static int fact(int n){
if (n>=1){
return n*fact(n-1);
}
else{
return 1;
}
}
}
