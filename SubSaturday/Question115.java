package SubSaturday;

import java.util.ArrayList;

class ProcessClass15 {
    public ArrayList<Integer> getMyArray(int arr1[],int arr2[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        int i=0;
        while(i<arr1.length)
        {
            if(arr1[i]%2==0)
            {
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length)
        {
            if(arr2[j]%2==0)
            {
                list.add(arr2[j]);
            }
            j++;
        }
        for(int k = arr2.length-1;k>=0;k--)
        {
            if(arr2[k]%2!=0)
            {
                list.add(arr2[k]);
            }
        }
        for(int k = arr1.length-1;k>=0;k--)
        {
            if(arr1[k]%2!=0)
            {
                list.add(arr1[k]);
            }
        }
        return (list);
    }
}
class Question115
{
    public static void main(String[] args) {
        
        int arr1[] = {3, 2, 1, 7, 6, 3};
        int arr2[] = {9, 3, 5, 6, 2, 8, 10};

        ProcessClass15 q1 = new ProcessClass15();

        ArrayList<Integer>list2 = q1.getMyArray(arr1, arr2);

        for(int i = 0; i < list2.size(); i++) {   
		    System.out.print(list2.get(i)+" ");
		} 

    }

}