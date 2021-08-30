package oneCode;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
 * 例如，当输入5时，应该输出的三角形为：
 * 1 3 6 10 15
 * 2 5 9 14
 * 4 8 13
 * 7 12
 * 11
 */
public class Hj35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int row = scanner.nextInt();
            for(int i = 1; i<= row+1 ;i++){
                for(int j = 1; j <= row - i + 1; j ++ ){
                    System.out.print(num(i,j)+ " ");
                }
                System.out.println();
            }
        }
    }

    public static int num(int x, int y){
        if(y == 1){
            return 1+(x)*(x-1)/2;
        }else {
            return num(x,y-1)+x+y-1;
        }
    }


    public static int num(int y){
        int sum = 1;
        if( y == 0){
            return 1;
        }else {
            return sum + num(y - 1);
        }
    }

    @Test
    public static void test(){
        for (int i = 0; i < 10; i++) {
            System.out.println(num(i));
        }
    }


}
