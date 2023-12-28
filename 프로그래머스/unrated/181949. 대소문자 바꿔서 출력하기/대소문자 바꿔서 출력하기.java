import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++){
            char charString = a.charAt(i);
            
            if (Character.isLowerCase(charString)){
                System.out.print(Character.toUpperCase(charString));
            }else{
                System.out.print(Character.toLowerCase(charString));
            }  
        }
    }
}