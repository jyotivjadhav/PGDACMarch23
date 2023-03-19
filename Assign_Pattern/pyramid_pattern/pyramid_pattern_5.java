class pyramid_pattern_5{
public static void main(String args[]){
	for(int i=9;i>=1;i--){
		for(int j=i;j>=1;j--){
		System.out.print("  ");
		}
		for(int k=i;k<=8;k++){
		System.out.print(k+" ");
		}
		for(int h=9;h>=i;h--){
		System.out.print(h+" ");
		
		}
	
		System.out.println();
	}
}
}
