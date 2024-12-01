public class bai20_xulyngoaile {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        try {
            int c = a/b;
            System.out.println("c = "+c);
        }
        catch (ArithmeticException ex){
            System.out.println("có lỗi toán học rồi thím ơi...");
        }
        catch (Exception ex){
            System.out.println("có lỗi rồi thím ơi");
        }
        finally {
            System.out.println("có lỗi hay không có lỗi đều phải chạy");
        }
        System.out.println("đoạn code phía sau");
    }
}
