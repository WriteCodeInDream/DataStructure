package oneCode;

import org.testng.annotations.Test;

/**
 *  计算一个小于5000字符串最后一个单词的长度
 */
public class StringMaxLength {


    public void testLength(){
        String b = "hello java";
        String[] stringList = b.split(" ");
        int listLength = stringList.length;
        System.out.println(stringList[listLength-1].length());
    }

    @Test
    public void test(){
        testLength();
    }
}
