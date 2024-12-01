public class bai26_giaibt24 {
    public static void main(String[] args) {
                /*
         * bài 24: 
         * viết chương trình lọc string từ đường dẫn D:/galailaptrinh/music/remix.mp3
         * 1. tách tên tệp bao gồm cả đuôi: remix.mp3
         * 2. tách tên file: remix
         */

         String path = "D:/galailaptrinh/music/remix.mp3";
         int lastSlashIndex = path.lastIndexOf('/');
         System.out.println(lastSlashIndex);
         String fileName = path.substring(lastSlashIndex+1);
         System.out.println(fileName);

        //  2. chỉ in remix
        int lastDotIndex = fileName.lastIndexOf('.');
        // trích từ chuỗi fileName, lấy từ đầu (index = 0 => sát vị trí index lastDotIndex)
        String hh = fileName.substring(0, lastDotIndex);
        System.out.println(hh);
    }
}
