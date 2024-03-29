import java.util.Scanner;
import java.util.Arrays;

public class Program10 {
     public static void maxAndMinArray(int[] arr) {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temb=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temb;
                }
            }
        }

        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right--]; 
            } else {
                result[i] = arr[left++]; 
            }
        }
        System.out.println( Arrays.toString(result));
    }
    
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int num =scanner.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
             System.out.println("Enter element"+" "+(i+1)+":");
             arr[i]=scanner.nextInt();
        }
        maxAndMinArray(arr);
    }
}

