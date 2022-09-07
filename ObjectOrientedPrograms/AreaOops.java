package ObjectOrientedPrograms;

public class AreaOops {
    
    private double radius,area;
    void setRadius(int radius)
    {
        this.radius =  radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double calculate(double radius)
    {
        area = 2*Math.PI*this.radius;
        return area;
    }
    void display()
    {
        this.area = calculate(this.radius);
        System.out.printf("AREA OF CIRCLE %.2f\n", this.area);
    }
}
class TestMain{
    public static void main(String[] args) {
        AreaOops a1 = new AreaOops();
        AreaOops a2 = new AreaOops();
        a2.setRadius(4);
        System.out.println(a2.getRadius());
        a1.setRadius(2);
        System.out.println(a1.getRadius());
        a2.display();
        a1.display();
    }
}
