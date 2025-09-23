

public class DebugCircle {

    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;
    
    public static void main(String[] args) {
        DebugCircle debugcircle = new DebugCircle(5);   
        System.out.println("Radius: " + debugcircle.getRadius());
        System.out.println("Diameter: " + debugcircle.getDiameter());
        System.out.println("Area: " + debugcircle.getArea());


    }

    public DebugCircle(int r) {

        this.radius = r;
        this.diameter = 2 * r;
        this.area = PI * r * r;

    }

    public int getRadius() {

        return radius;
    }

    public int getDiameter() {

        return diameter;
    }

    public double getArea() {

        return area;

    }

    public void debug() {

           }

    
}
