class star_16{
public static void main(String args[]){
 for(int i=1;i<=5;i++){
         for (int j = i; j < 5 ; j++) {
            System.out.print(" ");
        }
		for(int k=1;k<=i;k++){
			if((k==3 && i==4)||(k==2 && i==4)||(k==2 && i==3)){
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