package JavaOOPBasic.Polymorphysim.Shapes.Shapes;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(Double height,Double width){
        this.height = height;
        this.width = width;
        this.calculateArea();
        this.calculatePerimeter();
    }

    public final Double getHeight() {
        return this.height;
    }

    private void setHeight(Double height) {
        this.height = height;
    }

    public final Double getWidth() {
        return this.width;
    }

    private void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(2 * this.height + 2 * this.width);
    }

    @Override
    public void calculateArea() {
        super.setArea(this.height * this.width);
    }
}
