package SubSaturday;


class ArrayAverage
{
    public double avgOf(int arr[])
    {
        double avg=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        avg = sum/arr.length-1;
        return avg;
    }
}
public class ArrayAvg {
    public static void main(String[] args) {
        int []arr = {10,50,5,25};
        ArrayAverage a1 = new ArrayAverage();
        System.out.print("Average of Array:- "+a1.avgOf(arr));
    }
    
}
