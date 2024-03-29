import java.util.Scanner;

class Program6 {
    static void group(int studentsCount) {
        int num = studentsCount + 100;
        int grp = studentsCount / 5;
        for (int i = 1; i <= grp; i++) {
            System.out.println("Group: " + i);
            for (int j = 100 + i; j <= num; j += grp) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number Of Students:");
        int studentsCount = scanner.nextInt();
        group(studentsCount);
    }
}
