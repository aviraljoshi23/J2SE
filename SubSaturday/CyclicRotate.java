package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class ProcessClass6{
	
	public int[] getCyclicRotate(int []arr)
	{
		int temp = arr[arr.length-1];
		for(int i = arr.length-1;i>0;i--){
			arr[i]= arr[i-1];
		}
		arr[0] = temp;
		return (arr);
	}
}
public class CyclicRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int size =  sc.nextInt();
    
        int arr[] = new int[size];
        
        for(int i = 0;i<size;i++)
        {
            System.out.print("Enter the Element"+i+":- ");
            arr[i] = sc.nextInt();
        }
        
        ProcessClass6 pc6 = new ProcessClass6();
        
        arr = pc6.getCyclicRotate(arr);
        
        System.out.print(Arrays.toString(arr));
        
        
        
        sc.close();

	}

}
