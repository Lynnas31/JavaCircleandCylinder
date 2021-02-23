public class Test {
    public static void main(String[] args) {
       Circle circle = new Circle(12,"blue");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder);
    }
}
