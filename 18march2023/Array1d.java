import java.util.*;
class Array1d{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int arr[]=new int[a];
System.out.print("Enter array elements");
for(int i=0;i<a;i++){
	arr[i]=sc.nextInt();
}
System.out.print("print array elements");
for(int i=0;i<a;i++){
	System.out.print(arr[i]+" ");
}
//find maximum
int max=arr[0];
for(int i=0;i<arr.length-1;i++){
if(arr[i+1]>max){
	max=arr[i+1];
}
}
System.out.print("max: "+max+" ");
//find minimum
int min=arr[0];
for(int i=0;i<arr.length-1;i++){
if(arr[i+1]<min){
	min=arr[i+1];
}
}
System.out.print("min: "+min);
//search elements
int key=sc.nextInt();
for(int i=0;i<arr.length;i++){
	if(key==arr[i]){
	System.out.print("element found");
}
}

}
}