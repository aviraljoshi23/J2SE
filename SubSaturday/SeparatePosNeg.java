package SubSaturday;

import java.util.Arrays;
import java.util.Scanner;

class PosNeg{

    public void sortPosNeg(int[]arr)
    {
    	  for(int j=0;j<arr.length;j++)
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>0)
                {
                    continue;
                }
                else
                {
                    if(arr[i]>arr[i+1])
                    {
                        continue;
                    }
                    else if(arr[i]<0&&arr[i+1]<0)
                    {
                        continue;
                    }
                    else{
                        int temp = arr[i+1];
                        arr[i+1] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
   }
public class SeparatePosNeg {
    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Size of Array:- ");
	        int size =  sc.nextInt();
	        int arr[] = new int[size];
	        for(int i = 0;i<size;i++)
	        {
	            System.out.println("Enter the Element:- "+i);
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("USER INPUT ARRAY:-"+ Arrays.toString(arr));
	        PosNeg s1 = new PosNeg();
	        s1.sortPosNeg(arr);
	        for(int i = 0;i<arr.length;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	        sc.close();
	     }
    }
