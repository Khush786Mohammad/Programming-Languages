public class MultiArrays {
    public static void main(String[] args){
        int[][] grid = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {11,22,33}
        };

        int row = grid.length;
        int col = grid[0].length;

        System.out.println("Rows : " +row + " " + "cols: " + col);

        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        String values[][] = {{"Khush","Mohammad","B.Tech"},{"Lokesh","Bhakuni","B.Tech"},{"Aryan","Kumar","BCA"}};

        //using enhances for loop
        for(String[] rows : values){
            for(String elements : rows){
                System.out.print(elements + " ");
            }
            System.out.println();
        }

        //jagged arrays;

        int[][] jagged = {{1,2,3},{4,5},{6,7,8,9}};
        for(int[] rows : jagged){
            for(int val : rows){
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[][] transpose = {{10,5,20,40},{55,11,44,9},{67,43,76,23},{99,25,19,74}};

        System.out.println("Before Transpose of the Matrix");
        for(int[] rows : transpose){
            for(int val : rows){
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("After Matrix Transpose");
        int ROWS = transpose.length;
        int COLS = transpose[0].length;
        int[][] transposeMatrix = new int[COLS][ROWS];
        for(int i = 0 ; i<ROWS ; i++){
            for(int j = 0 ; j<COLS ; j++){
                transposeMatrix[i][j] = transpose[j][i];
            }
        }
        for(int[] rows : transposeMatrix){
            for(int val : rows){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
