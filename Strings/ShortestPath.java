import java.util.*;
public class ShortestPath {
    
    public static void FindPath(String Path){
        int x = 0;
        int y = 0;
        for (int i = 0; i < Path.length(); i++) {
            if(Path.charAt(i) == 'W'){
                x--;
            }
            else if(Path.charAt(i) == 'N'){
                y++;
            }
            else if(Path.charAt(i) == 'E'){
                x++;
            }
            else{
                y--;
            }

        }
        int X = x*x;
        int Y = y*y;
    
        System.out.println(x + "," + y + " Displacement : " + (float)Math.sqrt(X + Y));
    }
    public static void main(String[] args) {
        String Path = "WNEENESENNNSSWW";
        FindPath(Path);
    }
}
