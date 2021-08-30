package oneCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 找出字符串中第一个只出现一次的字符
 * 输入描述：
 * 输入几个非空字符串
 * 输出描述：
 * 输出第一个只出现一次的字符，如果不存在输出-1
 */
public class Hj59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            Map<String , Integer> map = new HashMap<>();
            String line = scanner.nextLine();
            for(char ch : line.toCharArray()){
                map.put(String.valueOf(ch),map.get(String.valueOf(ch)) == null ? 1 : map.get(String.valueOf(ch)) + 1);
            }
            int count = 0;
            for(String str:map.keySet()){
                if(map.get(str) == 1){
                    System.out.print(str + "");
                    count++;
                }
            }
            if(count == 0){
                System.out.println(-1);
            }
        }
    }
}
