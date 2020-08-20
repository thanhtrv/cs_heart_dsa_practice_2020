class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
//         height
        int R = obstacleGrid.length;
//         width
        int C = obstacleGrid[0].length;
        
        
        int[][] paths = new int[R][C];
        // paths[0][0] = 1;
//         first row
        for (int i = 0; i < C; i++) {
            if (obstacleGrid[0][i] != 1) {
                paths[0][i] = 1;
            } else {
                break;
            }
//             if (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) {
//                 paths[0][i] = 1;
//             } else {
//                 paths[0][i] = 0;

//             }
        }
//         first column
        for (int j = 0; j < R; j++) {
            if (obstacleGrid[j][0] != 1) {
                paths[j][0] = 1;
            } else {
                break;
            }
        }
        
        
        for (int i = 1; i < C; i++) {
            for (int j = 1; j < R; j++) {
                if (obstacleGrid[j][i] != 1) {
                    paths[j][i] = paths[j-1][i] + paths[j][i-1];
                }
            }
        }
        
        
        return paths[R-1][C-1];
        
    }
}

// O(MxN) = visit each time for each element
// O(Mxn) FOR SPACE COMPLEXITY this is can be improved by using theie matrix
