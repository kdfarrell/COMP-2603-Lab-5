import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends SimpleShape{
  
    protected int radius;
    
    public Circle(int r) {
       radius = r;
       xLoc += radius + 10;    
    }
    
    public String toString() {
        calculateArea();
        String s = super.toString();
        s = "Circle: " + s;
        return s;
    }
    
    public void calculateArea() {
        area = this.radius * this.radius * Math.PI;
    }
    
    public Shape draw() {
        return new Ellipse2D.Double(x, y, radius, radius);
    }
 
}
