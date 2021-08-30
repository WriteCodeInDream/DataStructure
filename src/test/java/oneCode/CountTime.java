package oneCode;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 计算一个字母出现的次数
 */
public class CountTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = scanner.next();
        System.out.println(line);
        System.out.println("请选择你要检验出现次数的字母");
        char nextByte = scanner.next().charAt(0);
        scanner.close();
        Map<String, Integer> time = new HashMap<>();
        for(int i = 0; i<line.length(); i++){
           if(null == time.get(String.valueOf(line.charAt(i)))){
               time.put(String.valueOf(line.charAt(i)),1);
           }else {
               time.put(String.valueOf(line.charAt(i)),time.get(String.valueOf(line.charAt(i)))+1);
           }
        }
        if(Character.isLowerCase(nextByte)){
            System.out.println("该字母出现的次数为:"+(time.get(String.valueOf(nextByte))+time.get(String.valueOf(Character.toUpperCase(nextByte)))));
        }else {
            System.out.println("该字母出现的次数为:"+(time.get(String.valueOf(nextByte))+time.get(String.valueOf(Character.toLowerCase(nextByte)))));
        }

    }

}
