package problems;
import java.util.*;
class isparagram {
//    public static void m1() {
//        System.out.println("in m1");
//    }
//
//    public static void m2() {
//        System.out.println("in m2");
//    }
//
//    public static void m3() {
//        System.out.println("in m3");
//    }
    public static boolean panagram(String str1) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
        	char x = Character.toUpperCase(ch);
            boolean present = false;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == ch || str1.charAt(i) == x) {
                    present = true;
                    break;
                }
            }
            if (present == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        m1();
//        m2();
//        m3();
        
        isparagram d = new isparagram();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str1=sc.nextLine();
        System.out.println(d.panagram(str1));
        }
}