public class bai23_mathjava {
    public static void main(String[] args) {
        System.out.println("pi = "+Math.PI);
        // trị tuyệt đối
        int a = - 10;
        System.out.println(" a = "+Math.abs(a));
        // max, min
        System.out.println(Math.max(4, 7));
        System.out.println(Math.min(4, 7));
        // căn bậc 2
        System.out.println(Math.sqrt(9));
        // lũy thừa
        System.out.println(Math.pow(4, 7));
        // sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("sin = "+sin);
        System.out.println("cos = "+cos);
        System.out.println("tan = "+tan);
    }
}
