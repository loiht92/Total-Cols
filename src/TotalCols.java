import java.util.Scanner;

public class TotalCols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row matrix");
        int rows = input.nextInt();
        System.out.println("Enter cols matrix");
        int cols = input.nextInt();
        int [][] matrix = new int [rows][cols];

        for (int i = 0 ; i < rows; i++){
            for (int j = 0 ; j < cols ; j++){
                System.out.println("matrix[" + i +"][" + j + "]");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Ban muon tinh tong cot bao nhieu: \n");
        int col = input.nextInt();
        int total = 0;
        for (int i = 0; i < rows ; i++){
            for (int j = 0 ; j <cols; j++){
                if (j== col)
                    total = total + matrix[i][j]; // neu muon tinh tong theo dong thi total = total + matrix[j][i] //
                }
            }
            System.out.println("Tong cua cot " +col +"la:" + total);

        }

    }

