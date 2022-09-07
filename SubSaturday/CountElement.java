package SubSaturday;

import java.util.Scanner;

class ShowCount
{
    public static void getElementCount(int[]arr,int x)
    {
        int count=0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==x){
                count++;
            }
        }
        if(count>0)
        {
            System.out.println(count);
        }
        else{
            System.out.println(-1);
        }
    }
}
public class CountElement {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int arr[] = {5,5,3,6,4,5};
        ShowCount.getElementCount(arr,5);
        sc.close();
        
    }
    
}
