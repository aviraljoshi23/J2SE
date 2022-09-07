package ObjectOrientedPrograms;

class MyMathClass {
    private int x,y,z;
    private float a;
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public int add()
    {
        z = x+y;
        return z;
    }
    public int substract()
    {
        z = x-y;
        return z;
    }
    public int multiply()
    {
        z = x*y;
        return z;
    }
    public float divide()
    {
        a = x/y;
        return a;
    }
    
}
class TestMain{
    public static void main(String[] args) {

        MyMathClass m1 = new MyMathClass();
        m1.setX(10);
        m1.setY(5);
        System.out.println(m1.add());
        System.out.println(m1.substract());
        System.out.println(m1.multiply());
        System.out.println(m1.divide());
    }
}

