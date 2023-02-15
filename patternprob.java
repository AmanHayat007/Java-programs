import java.util.Scanner;
public class patternprob {
    private static Scanner sc;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.print("Enter number of rows for the 1 and 0 triangle pattern:" );
        int rows= sc.nextInt();

        System.out.println("Printing right triangles for 1 and 0 numbers: ");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j<= i; j++)
            {
                if (((i%2==0)&&(j%2==0))||((i%2!=0)&&(j%2!=0))) {
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }


    }

    
}
