import java.util.*;
class compete
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array number");
        int num=sc.nextInt();
        int temp;;
        int arr[]=new int[num];
        for(int i=0; i<num;i++)
        {
             arr[i]=sc.nextInt();
        
        }      
        for(int a = 0; a <= arr.length - 1; a++)
      {
         for(int b = 0; b <= arr.length - 2; b++)
         {
            if(arr[b] < arr[b + 1])
            {
               temp = arr[b];
               arr[b] = arr[b + 1];
               arr[b + 1] = temp;
            }
         }
      }
        System.out.println();
        System.out.print("how many max number to return ");
        int k=sc.nextInt();
        for(int i=0; i<arr.length;i++)
        {
            if(k>0){
                System.out.println(arr[i]); 
            }
            k--;
        } 
    }
}