import java.util.Scanner;
public class Case8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        //String ipTen = scanner.nextLine();
        System.out.println(ipToTen(ip));
    }
    public static long ipToTen(String ip){
        String array[] = ip.split("\\.");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            Integer in = Integer.valueOf(array[i]);
            String dest = Integer.toBinaryString(in);
            dest = "00000000"+dest;
            dest = dest.substring(dest.length()-8);
            str.append(dest);
        }
        long x = Long.valueOf(str.toString(), 2);
        return x;
    }

}