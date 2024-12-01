package Enum;

public enum XepLoai {
    gioi ("XL giỏi"), //0
    kha ("XL khá"),    //1
    tb ("XL trung bình"),     //2
    yeu ("XL yếu"),    //3
    cut ("cút khỏi trường");   //4
    private String msg;
    XepLoai(String msg){
        this.msg = msg;
    }
    public String des(){
        return this.msg;
    }
}
