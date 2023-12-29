import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // 따옴표 제거
        String b = a.replace("\"","");
        // System.out.println(b);
        for (int i = 0; i < b.length(); i++){
            System.out.println(b.charAt(i));
        }
    }
}