import java.util.Scanner;
class Program3{
    static int reverse(int num){
        String rev_str="";
        while(num!=0){
            int rev=num%10;
            rev_str+=rev;
            num=num/10;
        }
        return Integer.valueOf(rev_str);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        int sub=reverse(number);
        System.out.println(number-sub);
    }
}