package JavaOOPBasic.Encapsulation.Lab;

public class Box {
    private Double length;
    private Double width;
    private Double height;

    public Box(Double length,double width,Double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double getLength() {

        return this.length;
    }

    private Double getWidth() {

        return this.width;
    }

    private Double getHeight() {

        return this.height;
    }

    private void setLength(Double length) {
        if (this.length <= 0){
            System.out.println("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(Double width) {
        if (this.width <= 0){
            System.out.println("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(Double height) {
        if (this.height <=0){
            System.out.println("Height cannot be zero or negative.");
        }
        this.height = height;
    }
}
