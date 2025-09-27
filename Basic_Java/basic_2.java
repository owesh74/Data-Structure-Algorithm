import java.util.*;
public class basic_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Cost of Pen : ");
        float pen = s.nextFloat();

        
        System.out.print("Enter Cost of pencil : ");
        float pencil = s.nextFloat();

        
        System.out.print("Enter Cost of earaser : ");
        float eraser = s.nextFloat();

        System.out.println("total Cost : " + (pen+pencil+eraser) );
        System.out.println("total Cost With 18% gst: " + (((pen+pencil+eraser)+((pen+pencil+eraser)*18)/100)) );
    }
}
