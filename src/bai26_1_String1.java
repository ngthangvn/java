public class bai26_1_String1 {
    public static void main(String[] args) {
        String s = "Mỗi đó tôi che môm em ruộng"+
                "\n không tin hai đứa mình lấy nhau";
        System.out.println(s);
        // khai báo đối tượng st
        StringBuilder chuoi = new StringBuilder();
        // 7. các phương thức thường dùng
        // 7.1 append: thêm vào cuối chuỗi
        chuoi.append("xin chào, ");
        chuoi.append("cho anh lam quen, ");
        chuoi.append("nhe !");
        System.out.println(chuoi);
        // 7.2 insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(2, "obama");
        System.out.println(chuoi);
        // 7.3 delete(start, end):
        // xóa tất cả các kỹ tự từ vị trí start đến vị trí end - 1
        chuoi.delete(2,7);
        System.out.println(chuoi);
        // 7.4 chuoi.length: trả về độ dài của chuỗi tính cả dấu cách
        System.out.println(chuoi.length());

        // buổi 2:
        // 7.5 IndexDf: kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi
        // trả về -1 nếu không tìm thấy
        String s7 = " tôi không tìm thấy tôi";
        System.out.println(s7.indexOf("tôi"));
        // 7.6 LastIndexDf: trả về vị trí index xuất hiện cuối cùng của ký tự hoặc chuỗi
        // trả về -1 nếu khồng tìm thấy
        System.out.println(s7.lastIndexOf("tôi"));
        // 7.7 contains: kiểm tra chuỗi con
        String s9 = ".mp3";
        String s10 = "tuhoc.mp4";
        // kiểm tra s10 có chứa cụm string s9 hay không?
        boolean check = s10.contains(s9);
        if (check == true){
            System.out.println("có .mp3 trong chuỗi");
        } else {
            System.out.println("không có .mp3 trong chuỗi");
        }

        // 7.8 Substring: trích lọc chuỗi ban đầu
        // substring(int beginIndex)
        // substring(int beginIndex, int endIndex)
        String s11 = "abcdefghk";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13 = s11.substring(4,7); // lấy đến sát 7
        System.out.println(s13);

        // 7.9 replace("str old", "str new") : thay tất cả từ
        String s14 = "học học nữa học mãi";
        String s15 = s14.replace("học", "ngủ");
        System.out.println(s14);
        System.out.println(s15);

        // 7.10 replaceFirst("str old", "str new")
        String s16 = s14.replaceFirst("học", "ngủ");
        System.out.println(s16);

        // 7.11 trim(): xóa toàn bộ khoảng trống ở đầu và cuối
        String s17 = "     xin chào bạn      ";
        String s18 = s17.trim();
        System.out.println(s17);
        System.out.println(s18);

        // 7.11 trim(): xóa toàn bộ khoảng trống ở cuối
        // cách 1: biểu thức chính quy (regular expression)
        // dùng \s+$ để xóa tất cả các khoảng trống ở cuỗi chuỗi
        String s19 = s17.replaceAll("\\s+$", "");
        System.out.println(s17);
        System.out.println(s17.length());
        System.out.println(s19);
        System.out.println(s19.length());

        // cách 2: xóa khoảng trắng cuối bằng vòng lặp
        String s20 = "       xin chào bạn        ";
        // .endsWith: kết thúc bằng
        while (s20.endsWith(" ")){
            s20 = s20.substring(0, s20.length()-1);
        }
        System.out.println(s17);
        System.out.println(s20);

        // 7.11 trim(): xóa toàn bộ khoảng trống ở đầu
        // cách 1: biểu thức chính quy (regular expression)
        // dùng \^s+ để xóa tất cả các khoảng trống ở đầu chuỗi
        String s21 = s17.replaceFirst("^\\s+", " ");
        System.out.println(s17);
        System.out.println(s21);

        // cách 2: xóa khoảng trắng đầu bằng vòng lặp
        String s22 = "         xin chào bạn        ";
        while (s22.startsWith(" ")){
            s22 = s22.substring(1);
        }
        System.out.println(s22);

        // 7.14: compare to, compareTolgnoreCase: so sánh 2 chuỗi
        /* chú ý: nếu bằng nhau thì trả về 0
                  nếu lớn hơn thì trả về > 0
                  nếu nhỏ hơn thì trả về < 0 */
        // compareTolgnoreCase: bỏ qua phân biệt hoc thường

        // bằng nhau
        String s23 = "abc13579";
        String s24 = "abc13579";
        int x = s24.compareTo(s23);
        // trả về x = 0
        System.out.println("x = "+x);

        // < 0
        String s25 = "Abc13579";
        String s26 = "abc13579";
        // A có giá trị 65 trong bảng ASII
        // a có giá trị 97 trong bảng ASII
        int x2 = s25.compareTo(s26);
        // trả về x < 0
        System.out.println("x2 = "+x2);

        // so sánh không phân biệt hoa thường
        String s27 = "Abc13579";
        String s28 = "abc13579";
        int x3 = s27.compareToIgnoreCase(s28);
        // trả về x = 0
        System.out.println("x3 = "+x3);

        // buổi 3
        // 7.17 spit tách chuỗi
        String s38 = "hello, word";
        String[] mang = s38.split(",");
        // duyệt mảng
        for (int i = 0; i < mang.length; i++){
            System.out.println(mang[i]);
        }

        // 7.18 toLowerCase() && toUpperCase()
        /* toLowerCase(): chuyển hết sang chữ thường
           toUpperCase(): chuyển hết sang chữ hoa
         */
        String s39 = "hôm Nay trời Mưa";
        String s40 = s39.toLowerCase();
        System.out.println(s40);
        String s41 = s39.toUpperCase();
        System.out.println(s41);

        // 7.19 toCharArray(): tách chuỗi thành từng ký tự, cho vào mảng
        String s42 = "abcdefgh@1456";
        char[] mang2 = s42.toCharArray(); // 'a'
        // duyệt mảng
        for (int i = 0; i < mang2.length; i++){
            System.out.println(mang2[i]);
        }

        // 7.20 reverse() Đảo ngược chuỗi
        String s43 = "123456789abc";
        // khai báo đối tượng thuộc class StringBuilder thì reverse mới xuất hiện
        StringBuilder sb = new StringBuilder(s43);
        sb.reverse();
        String s44 = sb.toString(); // chuyển sang chuỗi
        System.out.println(s44);
    }
}
