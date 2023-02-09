public class threeDarray {
    public static void main(String[] args){

        int[][][]A = {
                        {{25, 56, 87},{78, 57, 69},{53, 54, 10}},
                        {{13, 25, 67},{41, 59, 37},{13, 25, 69}},
                        {{87, 96, 57},{71, 69, 83},{50, 43, 11}}
        };
        for(int i=0;i<3;++i)
        {
            for(int j=0; j<3;++j)
            {
                for(int k=0; k<3; ++k)
                {
                    System.out.print("arr["+i+"]["+j+"]["+k+"] = " +A[i][j][k]+"\t");
            }
            System.out.print("\n");
            }
        }
    }
    
}
