class pattern13{
public static void main(String args[]){
int a=64;
for(int i=1;i<=5;i++){
	for(int j=5-i;j>=1;j--){
		System.out.print(" ");
		}	
		for(int k=1;k<=i;k++){
			System.out.print((char)(i+a)+" ");
			}
	System.out.println();
}
}
}