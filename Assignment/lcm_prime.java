import java.util.*;
class lcm_prime{
public static int primefact(int num1, int num2){
	int m=2;
	int a=1;
	while((num1>1)&&(num2>1)){
		if((num1%m==0)&&(num2%m==0)){
			//System.out.println(m+"");
			num1=num1/m;
			num2=num2/m;
			a=a*m;
			}

		else{
			m++;
			}
		if (m>num1 || m>num2){
			a=a*num1;
			a=num2*a;
			return a;
		}
		}
	return a;
	}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1,num2,res;
num1=sc.nextInt();
num2=sc.nextInt();

res=primefact(num1,num2);
System.out.println(res+"");

}
}