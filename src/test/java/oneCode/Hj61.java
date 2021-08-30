package oneCode;

import java.util.Scanner;

/**
 * 题目描述
 * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？
 * （用K表示）5，1，1和1，5，1 是同一种分法。
 * 数据范围：0<=m<=10，1<=n<=10。
 * 本题含有多组样例输入。
 * 输入描述：
 * 输入两个int整数
 * 输出描述：
 * 输出结果，int型
 */
public class Hj61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(getSum(m,n));
        }
    }
    private static int getSum(int m ,int n){
        if(n < 0 || m < 0){
            return 0;
        }
        if(n == 1 || m == 1) {
            return 1;
        }
        return getSum(m , n-1) + getSum(m - n , n);
    }
}
