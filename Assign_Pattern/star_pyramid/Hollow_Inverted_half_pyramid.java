class Hollow_Inverted_half_pyramid{
public static void main(String args[]){
	for(int i=6;i>=1;i--){
		for(int j=i;j>=1;j--){
			if((j==2 && i==5)||(j==3 && i==5)||(j==4 && i==5)||(j==2 && i==4)||(j==3 && i==4)||(j==2 && i==3)){
				System.out.print(" ");
			}
			else{
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}