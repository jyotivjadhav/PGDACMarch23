import java.util.*;
class Array2ddemo{

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int row,col;
	row=sc.nextInt();
	col=sc.nextInt();
	Array2d c = new Array2d();
	int [][] arr=c.getArr(row,col);
	int [][] arr1=c.getArr(row,col);
	c.show(arr);
	System.out.println();
	c.show(arr1);
	int [][] arr3=c.sumArr(arr,arr1);
	c.show(arr3);
	int [][] arr4=c.multArr(arr,arr1);
	c.show(arr4);
	int [][] arr5=c.subArr(arr,arr1);
	c.show(arr5);
	int [][] arr6=c.transposeArr(arr);
	c.show(arr6);

}
}
class Array2d{
	Scanner sc=new Scanner(System.in);
	public  int [][] getArr(int row,int col){
		Scanner sc=new Scanner(System.in);
		int arrayget[][]=new int[row][col];
		System.out.println("Enter array elements");
	    for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
				arrayget[i][j]=sc.nextInt();           
			}
 
            System.out.println();
        }
		return arrayget;
	}
	public  void show(int[][]arr){
		int row = arr.length;
		int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
			}
 
            System.out.println();
        }
 
	}
	public  int [][] sumArr( int [][] arr1, int [][] arr2){
		int row = arr1.length;
		int col = arr1[0].length;
		int arrayget[][]=new int[row][col];
	    for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
				arrayget[i][j]=arr1[i][j] + arr2[i][j];
			}
 
            System.out.println();
        }
		return arrayget; 
	}
    public  int [][] multArr( int [][] arr1, int [][] arr2){
		int row = arr1.length;
		int col = arr1[0].length;
		int arrayget[][]=new int[row][col];
	    for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
				arrayget[i][j]=arr1[i][j] * arr2[i][j];
			}
 
            System.out.println();
        }
		return arrayget; 
	}
    public  int [][] subArr( int [][] arr1, int [][] arr2){
		int row = arr1.length;
		int col = arr1[0].length;
		int arrayget[][]=new int[row][col];
	    for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
				arrayget[i][j]=arr1[i][j] - arr2[i][j];
			}
 
            System.out.println();
        }
		return arrayget; 
	}
    public  int [][] transposeArr( int [][] arr1){
		int col = arr1.length;
		int row = arr1[0].length;
		int arrayget[][]=new int[row][col];
	    for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
				arrayget[i][j]=arr1[j][i];
			}
 
            System.out.println();
        }
		return arrayget; 
	}
        
}
