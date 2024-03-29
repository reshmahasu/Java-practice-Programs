import java.util.Scanner;

public class Program59 {
    public static int substringIndex(String str1, String str2) {
    int len1 = str1.length();
    int len2 = str2.length();
    String subStr = "";
    for (int i = 0; i < len1; i++) {
        for (int j = 0; j < len2; j++) {
            if (i + j >= len1 || str2.charAt(j) != str1.charAt(i + j)) {
                break;
            }
            subStr += str1.charAt(i + j);
        }
        if (subStr.length() == len2) {
            return i;
        }
    }
    return -1;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Input String 2: ");
        String str2 = scanner.nextLine();
        
        int index = substringIndex(str1, str2);
         System.out.println("Output: " + index);
        
    }
}
