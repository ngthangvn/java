import java.util.Arrays;
import java.util.Scanner;

/**
 * bai27_3bt_mang
 */
public class bai27_3bt_mang {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        int[] pt = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("pt["+i+"] = ");
            pt[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(pt));
        System.out.println("Mang ban dau la: "+Arrays.toString(pt));

        for(int i = 0, j = pt.length-1; i < j; i++, j--){
            int temp = pt[i];
            pt[i] = pt[j];
            pt[j] = temp;
        }

        System.out.println("Mang sau khi dao nguoc la: "+Arrays.toString(pt));
        Arrays.sort(pt);
        System.out.println("Mang tang dan: "+Arrays.toString(pt));

        int tong = 0;
        for (int ptn : pt) {
            tong+=ptn;
        }
        System.out.println("Tong cac phan tu trong mang la: "+tong);

        System.out.println("Moi nhap so bat ky: ");
        int a = sc.nextInt();
        for(int i = 0; i < pt.length; i++){
            if (a == pt[i]) {
                System.out.println("Vi tri index là: "+i);
            } else{
                System.out.println("Khong thuoc mang");
            }
        }
    }
    
}