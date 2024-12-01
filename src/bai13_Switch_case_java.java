import java.util.Scanner;

public class bai13_Switch_case_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời cụ nhập vào 1 số n: ");
        int n = sc.nextInt();
        // kiểm tra só dư của a cho 2
        int div = n%2;
        switch (div){
            case 0:
                System.out.println(n+" là số chẵn");
                break;
            default:
                System.out.println(n+" là số lẻ");
        }
    }
}
