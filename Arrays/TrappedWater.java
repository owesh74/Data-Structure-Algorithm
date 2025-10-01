public class TrappedWater {
public static void TrapWater(int arr[]){
int Heigest = 0;
int Total = 0;   


//For Left
int LefMax[] = new int[arr.length];
LefMax[0] = arr[0];
for (int i = 1; i < arr.length; i++) {
    LefMax[i]  = Math.max(arr[i], LefMax[i-1]);

}

//For Right
int RigMax[] = new int[arr.length];
RigMax[arr.length-1] = arr[arr.length-1];

for (int i = arr.length-2; i >= 0; i--) {

RigMax[i]= Math.max(arr[i], RigMax[i+1]);
}


for (int i = 0; i < arr.length; i++) {
    Heigest = Math.min(RigMax[i] , LefMax[i]);
    Total += Heigest - arr[i];
  
   
}
System.out.println(Total);
}

public static void main(String[] args) {
    int arr[] ={0,1,0,2,1,0,1,3,2,1,2,1};
    TrapWater(arr);
}
}
