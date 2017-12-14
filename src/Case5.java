/**
 * Author: bjccdsrlcr
 * Date: 2017/12/11 0011
 * Time: 20:02
 * 题目描述
写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
输入描述:
输入一个十六进制的数值字符串。
输出描述:
输出该数值的十进制字符串。
示例1
输入

0xA
输出

10
 */
import java.util.Scanner;
public class Case5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String hex = scanner.nextLine();
            Integer x = Integer.parseInt(hex.substring(2), 16);
            System.out.println(x);
        }
    }
}