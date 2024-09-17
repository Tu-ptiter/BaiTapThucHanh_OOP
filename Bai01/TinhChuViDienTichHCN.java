package Bai01;

public class TinhChuViDienTichHCN {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Vui long nhap dung 2 tham so chieu dai va chieu rong");
            return;
        }
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        if ( width <= 0 || height <= 0){
            System.out.println("Chieu dai va chieu rong phai la so nguyen duong");
            return;
        }

        System.out.println("Chu vi "+ (2 *(width+height)));
        System.out.println("Dien tich "+ (width*height));


    }
}
