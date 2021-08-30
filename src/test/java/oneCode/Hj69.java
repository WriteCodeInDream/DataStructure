package oneCode;

import java.util.Scanner;

/**
 * 如果A是个x行y列的矩阵，B是个y行z列的矩阵，把A和B相乘，其结果将是另一个x行z列的矩阵C。这个矩阵
 * 的每个元素是由下面的公式决定的
 *(k-> 1 y)的求和 C（ij） = Aik * Bkj
 * 矩阵的大小不超过100*100
 * 输入描述：
 * 输入包含多组数据，每组数据包含：
 * 第一行包含一个正整数x，代表第一个矩阵的行数
 * 第二行包含一个正整数y，代表第一个矩阵的列数和第二个矩阵的行数
 * 第三行包含一个正整数z，代表第二个矩阵的列数
 * 之后x行，每行y个整数，代表第一个矩阵的值
 * 之后y行，每行z个整数，代表第二个矩阵的值
 *
 * 输出描述：
 * 对于每组输入数据，输出x行，每行z个整数，代表两个矩阵相乘的结果
 */
public class Hj69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int[][] a = new int[x][y];
            int[][] b = new int[y][z];
            int[][] c = new int[x][z];

            for(int i = 0;i<x;i++){
                for (int j = 0; j < y; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }

            for(int i = 0;i<y;i++){
                for (int j = 0; j < z; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0;i<x;i++){
                for (int j = 0; j < z; j++) {
                    c[i][j] = getNum(i,j,a,b);
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    private static int getNum(int i,int j,int[][] a, int[][] b){
        int sum = 0;
        for(int k = 0 ; k < a[0].length; k++){
            sum = sum + a[i][k] * b[k][j];
        }
        return sum;
    }
}
