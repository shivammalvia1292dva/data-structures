package misc;

public class DiagnolTraversalOfMatrix {
  static final int MAX = 100;

  static void printMatrixDiagonal(int mat[][], int n) {
    int rows = mat.length;
    int cols = mat[0].length;
    int maxSum = rows + cols - 2;

    for (int sum = 0; sum <= maxSum; sum++) {
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          if (i + j - sum == 0) {
            System.out.print(mat[i][j] + "\t");
          }
        }
      }
      System.out.println();
    }
  }

  // Driver code
  public static void main(String[] args) {
    int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int n = 3;
    printMatrixDiagonal(mat, n);
  }
}
