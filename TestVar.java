
public class TestVar {
    static void show(int...a){
        System.out.println("Number of Arguments:" + a.length);
        for (int i:a)
        System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        show(1,2);
        show(10);
        show(10,20,30,40);
        show(new int[]{10,20,30});   
    }
    
}
