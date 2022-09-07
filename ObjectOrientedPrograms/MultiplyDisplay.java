package ObjectOrientedPrograms;

class MyMultiply {

    public int getMultiply(int x,int y)
    {
        return x*y;
    }
    public float getMultiply(float x,float y,float z)
    {
        return x*y*z;
    }
    public int getMultiply(int []arr)
    {
        int val=1;
        for(int i=0;i<arr.length;i++)
        {
            val = val*arr[i];
        }
        return val;
    }
    public double getMultiply(int x,double y)
    {
        return x*y;
    }
}
class MultiplyDisplay
{
    public static void main(String[] args) {

        MyMultiply m1 = new MyMultiply();
        int []arr = {2,4,6,8};
        System.out.println(m1.getMultiply(arr));
        
    }
}
