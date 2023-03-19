class abc{
public static void main(String args[]){
for (int i=5;i>=1;i--){
	String newString = " ".repeat(i-1);
	System.out.print(newString);
	for(int k=i;k<=5;k++){
		System.out.print(k+" ");
	}
	System.out.println();
}
}
}