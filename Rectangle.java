import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;

public class Rectangle extends SimpleShape{
    
    private int length;
    private int breadth;
    private int edgeRoundness;
    
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
        edgeRoundness = 0;
        xLoc += length + 10;
    }
    
    // Example of Refinement
    public String toString() {
        calculateArea();
        String s = super.toString();
        s = "Rectangle " + s;
        return s;
    }
    
    public void setEdgeRoundness(int round) {
        this.edgeRoundness = round;
    }
    
    public void calculateArea() {
        area = this.length * this.breadth;
    }
    
    public Shape draw() {
        return new RoundRectangle2D.Double(x, y, length, breadth,this.edgeRoundness, this.edgeRoundness);
    }
}
