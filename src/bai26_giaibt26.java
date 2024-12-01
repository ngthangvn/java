/**
 * bai26_giaibt26
 */
public class bai26_giaibt26 {

    public static void main(String[] args) {
        
                 /*
          * bài 26:
          nhập vào 1 chuỗi => tối ưu hóa chuỗi (chuẩn hóa chuỗi) theo quy tắc:   
          1, không có, khoảng trắng dư thừa
          2, các từ cách nhau bởi 1 khoảng trắng 
          3, ký tự đầy tiên của mỗi từ phải viết hoa, chữ cái phía sau viết thường
            ví dụ: input:"  Gà lạI LẬp   TRìnH  "
            output: "Gà Lại Lập Trình"
          */
        String input = "  Ga laI LAp   TRinH  ";

        System.out.println(chuanHoa(input));
    }

    public static String chuanHoa(String input){
        input = input.trim();
        String[] words = input.split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].toLowerCase();
            String firsChar = words[i].substring(0, 1);
            firsChar = firsChar.toUpperCase();
            words[i] = firsChar + words[i].substring(1);
        }

        return String.join(" ", words);
    }
}