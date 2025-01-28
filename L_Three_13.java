import java.util.Random;

public class L_Three_13 {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix multiplication is not possible: column count of matrix1 must be equal to row count of matrix2");
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            throw new IllegalArgumentException("Matrix is not 2x2");
        }
    }

    public static int determinant3x3(int[][] matrix) {
        if (matrix.length == 3 && matrix[0].length == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                    matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                    matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        } else {
            throw new IllegalArgumentException("Matrix is not 3x3");
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = createRandomMatrix(2, 2);
        int[][] matrix2 = createRandomMatrix(2, 2);
        
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        int[][] addedMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition:");
        printMatrix(addedMatrix);
        
        int[][] subtractedMatrix = subtractMatrices(matrix1, matrix2);
        System.out.println("Matrix Subtraction:");
        printMatrix(subtractedMatrix);
        
        int[][] multipliedMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matrix Multiplication:");
        printMatrix(multipliedMatrix);
        
        int[][] transposedMatrix = transposeMatrix(matrix1);
        System.out.println("Matrix 1 Transposed:");
        printMatrix(transposedMatrix);
        
        int det2x2 = determinant2x2(matrix1);
        System.out.println("Determinant of Matrix 1 (2x2): " + det2x2);
        
        int[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("Matrix 3x3:");
        printMatrix(matrix3x3);
        
        int det3x3 = determinant3x3(matrix3x3);
        System.out.println("Determinant of Matrix 3x3: " + det3x3);
    }
}
