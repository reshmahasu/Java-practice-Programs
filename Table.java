import java.util.Scanner;
class Table{
    static void mul(int table_number,int start,int end){
        System.out.println();
        for(int i=start;i<=end;i++){
            System.out.println(i+"x"+table_number+"="+(i*table_number));
        }
    }

    static void sub(int table_number,int start,int end){
        System.out.println();
        for(int i=start;i<=end;i++){
            System.out.println(i+"-"+table_number+"="+(i-table_number));
        }
    }
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the Table number :");
        int table_number=number.nextInt();
        System.out.println("Enter the Starting value :");
        int start=number.nextInt();
        System.out.println("Enter the Ending value:");
        int end=number.nextInt();
        mul(table_number,start,end);
        sub(table_number,start,end);
    }
}