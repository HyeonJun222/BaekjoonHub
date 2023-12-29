import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String aRe = a.replace(" ", "");
        String bRe = b.replace(" ", "");
        
        System.out.print(aRe + bRe);
    }
}