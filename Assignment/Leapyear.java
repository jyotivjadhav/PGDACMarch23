import java.util.*;
class Leapyear{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int year;
year=sc.nextInt();
if((year%4==0)&& (year%100!=0)||(year%400==0)){
System.out.println("this year is leap year");
}
else{
System.out.println("this year is not leap year");
}
}
}