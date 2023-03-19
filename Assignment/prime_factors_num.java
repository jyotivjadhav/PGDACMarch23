import java.util.*;
class prime_factors_num{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num,m=2;
num=sc.nextInt();
while(num>1){
if(num%m==0){
System.out.println(m+"");
num=num/m;
}
else{
m++;
}
}
}
}