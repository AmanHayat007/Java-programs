class oddArray
{
        public static void main(String[] args)
        {
                int table[][] = new int [10][10];
                for (int r=0; r<table.length; r++)
                {
                        int total = 0;
                        for (int c=1; c<=table[r].length; c+=2)
                        {
                                System.out.printf(r*c+"\t");
                                total+= table[c][r];
                        }
                        System.out.println();
                        System.out.println(total);
                }
        }
}