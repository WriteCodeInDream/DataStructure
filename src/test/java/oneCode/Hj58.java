package oneCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 输入n个整数，输出其中最小的k个。
 * 本题有多组输入样例，请使用循环读入，比如while(cin>>)等方式处理
 * 输入描述：
 * 第一行输入两个整数n和k
 * 第二行输入一个整数数组
 * 输出描述：
 * 输出一个从小到大排序的整数数组
 */
public class Hj58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int total = scanner.nextInt();
            int need = scanner.nextInt();
            List<Integer> numList = new ArrayList<>(total);
            for(int i = 0;i < total;i++){
                numList.add(scanner.nextInt());
            }
            numList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            });

            for (int i = 0; i < need; i++){
                System.out.print(numList.get(i) + " ");
            }
        }
    }
}
