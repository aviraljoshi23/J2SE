package SubSaturday;

public class peakELement {
    public static void main(String arg[])
    {
        int arr[] = {15,26,14,25};
        ShowPeakElement s1 = new ShowPeakElement(arr,arr.length);
        System.out.println("Peak ELement is :- "+arr[s1.getPeakElement()]);
    }
}
class ShowPeakElement
{
    private int arr[];
    private int size;
    private int max=0;

    // constructor
    public ShowPeakElement(int arr[],int size)
    {
        this.arr = arr;
        this.size  = size;
    }
    private int peakLogic(int arr[],int size)
    {
        for(int i = 0;i<size;i++)
        {
            if(this.arr[this.max]<this.arr[i])
            {
                this.max = i;
            }
        }
        return this.max;
    } 
    public int getPeakElement()
    {
        return peakLogic(arr,size);
    }
}
