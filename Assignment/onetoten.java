class onetoten{
public static void main(String args[]){
recurnum(1);
}
public static void recurnum(int n){
if(n<=10){
System.out.println(n);
recurnum(n+1);
}
}
}