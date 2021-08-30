package oneCode;

import org.testng.annotations.Test;

import java.util.*;

/**
 * 题目描述
 * 若两个正整数的和为素数，则这两个正整数称之为“素数伴侣”，如2和5、6和13，它们能应用于通信加密。
 * 现在密码学会请你设计一个程序，从已有的N（N为偶数）个正整数中挑选出若干对组成“素数伴侣”，挑选方案多种多样，
 * 例如有4个正整数：2，5，6，13，如果将5和6分为一组中只能得到一组“素数伴侣”，而将2和5、6和13编组将得到
 * 两组“素数伴侣”，能组成“素数伴侣”最多的方案称为“最佳方案”，当然密码学会希望你寻找出“最佳方案”。
 * 输入:
 * 有一个正偶数N（N≤100），表示待挑选的自然数的个数。后面给出具体的数字，范围为[2,30000]。
 * 输出:
 * 输出一个整数K，表示你求得的“最佳方案”组成“素数伴侣”的对数。
 */
public class Hj28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> map = new HashMap<>();
        int index = 0;
        while (scanner.hasNext()){
            List<Integer> numList = new ArrayList<>();
            int size = scanner.nextInt();
            if(size % 2 != 0){
                System.out.println("请输入偶数");
                continue;
            }
            for(int i = 0; i<size; i++){
                numList.add(scanner.nextInt());
            }
            map.put(String.valueOf(index), numList);
            index++;
        }
        for(String str : map.keySet()){
            List<Integer> list = map.get(str);

        }
    }

    public static boolean isRequired(int num){
        int i = 2;
        if(num <=2){
            return true;
        }
        while (i < num){
                if(num % i == 0){
                    return false;
                }else {
                    i ++;
                }
        }
        return true;
    }

    @Test
    public static void test(){
        for (int i = 0; i < 100; i++){
            if(isRequired(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
