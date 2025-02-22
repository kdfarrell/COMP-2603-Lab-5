import java.awt.Color;
public class ShapeRunner{
   public static void main(String[] args){
     ShapeScreen s = new ShapeScreen();
     
     SimpleShape s1 = new SimpleShape();
     
     //Rectangle s2 = new Rectangle(50, 100);
     SimpleShape s2 = new Rectangle(50, 100);
     Circle s3 = new Circle(50);
     Circle s4 = new Circle(30);
     Rectangle s5 = new Rectangle(300,100);
     
     Rectangle s6 = (Rectangle) s2;
     s6.setEdgeRoundness(35);
     s5.setEdgeRoundness(35);
    
     SimpleShape[] shapes = new SimpleShape[5];
     shapes[0] = s1;
     shapes[1] = s2;
     shapes[2] = s3;
     shapes[3] = s4;
     shapes[4] = s5;
     
     for (SimpleShape ss : shapes) {
         System.out.println(ss.toString());
         
         if (ss instanceof Rectangle) {
             ss.setColor(Color.blue);
         }
     }
     
     
     ShapeScreen screen = new ShapeScreen(shapes);
     
     
     
     
   }
}
