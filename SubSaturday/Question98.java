package SubSaturday;

class ProcessClass18
{
    public int getPairCounts(int arr[])
    {
        int count_one=0;
        int count_zero=0;
        int count=0;
        for(int  i = 0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count_zero++;
            }
            else if(arr[i]==1){
                count_one++;
            }
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]==1)
                {
                    count_one++;
                }
                else if(arr[j]==0)
                {
                    count_zero++;
                }
                if(count_one==count_zero)
                {
                    count++;
                }
            }
        }
        return count;
    }

}
public class Question98 {
    public static void main(String[] args) {
        
        int []arr = {1,0,0,1,0,1,1};

        ProcessClass18 pc18 = new ProcessClass18();
        System.out.println(pc18.getPairCounts(arr));

    }
}
