
public class Swaptree {
    public static void main(String[] args) {
        int[] treeList = {72, 71, 70, 69, 68, 65, 78, 88, 61, 63};
        swapTrees(treeList);
        
        for (int i = 0; i < treeList.length; i++) {
            System.out.print(treeList[i] + " ");
        }
    }

    public static void swapTrees(int[] treeList) {
        int n = treeList.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (treeList[j] > treeList[j+1]) {
                    int temp = treeList[j];
                    treeList[j] = treeList[j+1];
                    treeList[j+1] = temp;
                }
            }
        }
    }
}

