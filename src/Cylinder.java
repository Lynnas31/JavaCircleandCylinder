public class Cylinder extends Circle{
    private double height = 2;

    public Cylinder(){}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(int radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+ "Area" + getArea() + "Perimeter" + getPerimeter();
    }
    public double getArea(){
        return super.getArea()*2+super.getPerimeter()*this.height;
    }
    public double getPerimeter(){
        return super.getArea()*this.height;
    }
}
