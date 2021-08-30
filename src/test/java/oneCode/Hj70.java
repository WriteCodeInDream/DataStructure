package oneCode;

import java.util.Scanner;

/**
 * 矩阵乘法的运算量与矩阵乘法的顺序强相关。
 * 例如：
 * A是一个50×10的矩阵，B是10×20的矩阵，C是20×5的矩阵
 * 计算A*B*C有两种顺序：（（AB）C）或者（A（BC）），前者需要计算15000次乘法，后者只需要3500次。
 * 编写程序计算不同的计算顺序需要进行的乘法次数。
 * 本题含有多组样例输入！
 */
public class Hj70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int total = scanner.nextInt();
        }



    }
    private static int getTotal(int x , int y, int z){
        // a x行y列
        // b y行Z列
        return x*y*z;
    }
}
