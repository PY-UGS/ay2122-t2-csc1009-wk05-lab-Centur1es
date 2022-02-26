package T5;

public class Circle extends Shape{
    public Circle(double radius1, double radius2) {
        super(radius1, radius2);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Circle");
        return this.getPI() * this.getDim1() * this.getDim2();
    }
}
