package finalexam;

public class QuestionThreeLowestToHighest {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        
        // Find total number of items in the 2D array
        int noItems = 0;
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers[i].length; j++) {
                noItems++;
            }
        }
        
        // Create a 1D array and populate all the items from the 2D array
        int[] oneDim = new int[noItems];
        int pos = 0;
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers[i].length; j++) {
                oneDim[pos++] = numbers[i][j];
            }
        }
        
        // Sort the 1D array
        for (int i=0; i<oneDim.length; i++) {
            for (int j=i+1; j<oneDim.length; j++) {
                if (oneDim[i] > oneDim[j]) {
                    int temp = oneDim[i];
                    oneDim[i] = oneDim[j];
                    oneDim[j] = temp;
                }
            }
        }
        
        // Print the array
        for (int i=0; i<oneDim.length; i++) {
            System.out.println(oneDim[i]);
        }
        
    }

}
