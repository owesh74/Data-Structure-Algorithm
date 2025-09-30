public class pattern {

    public static void Hollow_Square(int Rows, int Colm) {
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Colm; j++) {
                if (i == 1 || i == Rows || j == 1 || j == Colm) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void Inverted_Pyramid(int Rows, int Colm) {
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Colm; j++) {
                if ((i + j) >= 5) {
                    System.out.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Aproach II for inverted Pyramid
    public static void Inverted_Pyramid_II(int Rows) {
        for (int i = 1; i <= Rows; i++) {

            // Spaces
            for (int k = 1; k <= Rows - i; k++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // inverted Number Pyramid
    public static void Inverted_Pyramid_Numbers(int Rows) {

        for (int i = 1; i <= Rows; i++) {

            for (int k = 1; k <= Rows - i + 1; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    // Floyed Triangle
    public static void Floyed_Triangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num);
                num++;
            }

            System.out.println();
        }
    }

    // 0-1 Triangle
    public static void Tri01(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    // ButerFly Pattern
    public static void ButterFly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (n*2)-(i*2); k++) {
                System.out.print("  ");

            }
            for (int l = 1; l <= i; l++) {

                System.out.print("* ");

            }
            System.out.println();
        }


        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (n*2)-(i*2); k++) {
                System.out.print("  ");

            }
            for (int l = 1; l <= i; l++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }



    //Rhombus
    public static void Rhombus(int n){
        for(int i = 1; i <= n ; i++){
            for(int j=1; j<= (n-i) ;j++){
                System.out.print("  ");
            }
            for(int k = 1;k <= n; k++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }

 //HollowRhombus
 public static void HollowRhombus(int n){
    for(int i = 1; i <= n ; i++){
        for(int j=1; j<= (n-i) ;j++){
            System.out.print("  ");
        }
        for(int k = 1;k <= n; k++){
            if(i == 1 || i == n || k == 1 || k == n){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}


//Diamond Pattern
public static void Diamond(int n){
    for (int i = 1; i <= n; i++) {
    
        //Spaces
        for (int j = 1; j <= n-i; j++) {
            System.out.print("  ");
            
        }
        for (int k = 1; k <= (i*2)-1; k++) {
            System.out.print("* ");
        }
       
        System.out.println();
    }   
    for (int i = n; i >= 1; i--) {
    
        //Spaces
        for (int j = 1; j <= n-i; j++) {
            System.out.print("  ");
            
        }
        for (int k = 1; k <= (i*2)-1; k++) {
            System.out.print("* ");
        }
       
        System.out.println();
    }   
}



//NUMBER PYRAMID
public static void NumPyramid(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <=i; k++) {
            System.out.print(i+" ");
            
        }
        System.out.println();
    }
}

//Palindromic Pyramid
public static void PalindromicPyramid(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int k = i; k >=1; k--) {
            System.out.print(k);
            
        }
        for (int l = 2; l <= i; l++) {
            System.out.print(l);
        
        }
        System.out.println();
    }
}



    public static void main(String args[]) {
        Hollow_Square(4, 4);
        Inverted_Pyramid(8,8);
        Inverted_Pyramid_II(50);
        Inverted_Pyramid_Numbers(4);
        Floyed_Triangle(5);
        Tri01(5);
        ButterFly(4);
        Rhombus(5);
        HollowRhombus(5);
        Diamond(4);
        NumPyramid(5);
        PalindromicPyramid(5);

    }
}