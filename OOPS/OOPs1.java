public class OOPs1{

    public static void main(String[] args) {
        Pen p = new Pen();
        p.Setcolor("Yellow");
        System.out.println(p.color);
        p.Tip(4);
        System.out.println(p.tip);
    }
}

class Pen {
    String color;
    int tip;

    void Setcolor(String setcolor){
        color = setcolor;
    }
    void Tip(int settip){
        tip = settip;
    }
}