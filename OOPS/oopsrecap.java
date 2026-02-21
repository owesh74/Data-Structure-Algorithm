public class oopsrecap{

public static void main(String args[]){


Pen p1 = new Pen();
p1.setcolor("blue");
System.out.println("Meowwwwwwww!" + " " + p1.color);
p1.size = 5;

}

}

class Pen{

String color;
public int size;

Pen(){
System.out.println("I'm Constructor"); 
}
void setcolor(String newcolor){
color = newcolor;
}

}