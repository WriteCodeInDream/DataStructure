package oneCode;

import java.util.*;

/**
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。
 * 输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 注意每个输入文件有多组输入，即多个字符串用回车隔开
 * 输入描述：
 * 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 *
 * 输出描述：
 * 删除字符串中出现次数最少的字符后的字符串。
 */
public class Hj23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strList = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.length()<=20){
                strList.add(line);
            }else {
                break;
            }
        }
        for(String str : strList){
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0 ;i <str.length();i++){
                map.put(str.charAt(i),map.get(str.charAt(i)) == null ? 1:map.get(str.charAt(i)) + 1);
            }
            List<Character> charList = new ArrayList<>();
            int currentNum = 20;
            for(char charSet : map.keySet()){
                if(map.get(charSet) < currentNum){
                    currentNum = map.get(charSet);
                    charList = new ArrayList<>();
                    charList.add(charSet);
                }if(map.get(charSet) == currentNum){
                    charList.add(charSet);
                }
            }

            for(char charOne : charList){
                str = str.replace(charOne,' ');
            }
            String[] strAfter = str.split(" ");
            for(String strOne : strAfter){
                System.out.print(strOne);
            }
            System.out.println();
        }
    }
}
