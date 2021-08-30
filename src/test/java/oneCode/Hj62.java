package oneCode;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * 输入一个正整数，计算它在二进制下的1的个数。
 * 注意多组输入输出！！！！！！
 * 输入描述：
 * 输入一个整数
 * 输出描述：
 * 计算整数二进制中1的个数
 */
public class Hj62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()){
            long l = scanner.nextLong();
            System.out.println(sum(l));
        }
    }
    private static int sum(long l){
        int count = 0;
        while (l >= 1){
            if(l == 1){
                count++;
                break;
            }
            if(l % 2 == 1){
                count++;
            }
            l = l/2;
        }
        return count;
    }

    @Test
    private static void tets(){
        System.out.println(sum(10));
    }
}
