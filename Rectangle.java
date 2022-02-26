package T5;

public class Rectangle extends Shape{
    public Rectangle(double base, double height){
        super(base,height);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Rectangle");
        return this.getDim1()*this.getDim2();
    }
}
