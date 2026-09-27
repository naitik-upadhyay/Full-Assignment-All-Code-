import java.util.*;
public class linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8};
        int x = sc.nextInt();
        Boolean p = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                p = true;
                
            }
        }
        if(!p){
            System.out.println("X is not found in array");
        }
        else{
            System.out.println("X is not found in array");
        }
    }
}