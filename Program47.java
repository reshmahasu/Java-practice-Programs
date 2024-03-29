import java.util.Scanner;

public class Program47 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS:");
        int row = scanner.nextInt();
        System.out.println("OUTPUT:");

        for(int i=1;i<=row;i++){
            for(int j=row; j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
             if(i!=1){
                for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
             }
            System.out.println();
        }
    }
}
// for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <=row - i; j++) {
//                 System.out.print("  ");
//             }
//             int p = 1;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(p++ + " ");
//             }
//             p -= 2;
//             for (int j = 1; j <= i - 1; j++) {
//                 System.out.print(p-- + " ");
//             }

//             System.out.println();
//         }