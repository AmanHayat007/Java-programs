import java.util.*;
public class arr{
    static int get(int n, int[] arr){
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]<0)
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            System.out.println(get(n,arr));

        }
        
    }
}