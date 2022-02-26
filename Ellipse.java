package T5;

public class Ellipse extends Shape{

    public Ellipse(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Ellipse");
        return this.getPI() * this.getDim1() * this.getDim2();
    }
}
