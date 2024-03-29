import java.util.ArrayList;
import java.util.Scanner;

public class Program53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE STRING WITH NUMBER: ");
        String string = scanner.nextLine();
        getOutput(string);
    }

    public static void getOutput(String string) {
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            StringBuilder number = new StringBuilder();
            if (Character.isLetter(ch)) {
                charList.add(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
                for (int j = i + 1; j < string.length(); j++) {
                    char nextChar = string.charAt(j);
                    if (Character.isDigit(nextChar)) {
                        number.append(nextChar);
                        i++; 
                    } else {
                        break;
                    }
                }
                intList.add(Integer.parseInt(number.toString()));
            }
        }

        int charIndex = 0;
        for (int repetition : intList) {
            char ch = charList.get(charIndex);
            for (int j = 0; j < repetition; j++) {
                System.out.print(ch);
            }
            charIndex++;
        }
    }
}
