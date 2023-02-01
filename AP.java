class AP
{
static void printAP(int a, int d, int n)
{

    int current_term;
    current_term=a;
    for (int i = 1; i <= n; i++)
    { System.out.print(current_term + " ");
    current_term =current_term + d;
    
    }
}
 public static void main(String[] args)
{
int a = 1; // First Term
 
int d = 2; //common difference

int n = 16; // Nth num
 
printAP(a, d, n);
}
}
