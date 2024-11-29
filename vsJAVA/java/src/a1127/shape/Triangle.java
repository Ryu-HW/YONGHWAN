package a1127.shape;

public class Triangle extends Shape {
    double width,height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle() {
    }

    @Override
    double area() {
        
        return (width*height)/2;
    }

    @Override
    double round() {
        //정삼각형
        return 3*width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle [width=" + width + ", height=" + height + "]";
    }

}
