import java.util.Scanner;

/**
 * Author: bjccdsrlcr
 * Date: 2017/12/11 0011
 * Time: 14:26
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入
    hello world
   输出
    5
 */
public class Case1 {
    public static int lastNumber(String string){
        String aa[] = string.split(" ");
        int len = aa.length;
        System.out.println(aa[len-1]);
        String b = aa[len-1];
        return b.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            int len = lastNumber(str);
            System.out.println(len);
        }
    }
}
