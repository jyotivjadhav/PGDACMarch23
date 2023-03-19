class Inverted_full_pyramid
{
public static void main(String args[]){
for(int i=6;i>=1;i--){
	for(int j=6-i;j>=1;j--){
	System.out.print(" ");
	}
		for(int k=i;k>=1;k--){
	System.out.print('*'+" ");
	}
	System.out.println();
}
}
}