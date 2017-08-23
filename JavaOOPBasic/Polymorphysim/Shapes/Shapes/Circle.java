package JavaOOPBasic.Polymorphysim.Shapes.Shapes;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius){
        this.radius = radius;
        this.calculateArea();
        this.calculatePerimeter();
    }

    public final Double getRadius() {
        return this.radius;
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(this.radius * 3.14 *2);
    }

    @Override
    public void calculateArea() {
        setArea(this.radius * this.radius * 3.14);
    }
}
