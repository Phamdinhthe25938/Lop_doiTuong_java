public class main_B1 {
    public static void main(String[] args) {
        B1_lopHinhChuNhat rectangle = new B1_lopHinhChuNhat(12,8);
        System.out.println("Dien tich hinh chu nhat la:"+rectangle.getArea());
        rectangle.setHeght(-5);
        System.out.println("Dien tich hinh chu nhat la:"+rectangle.getArea());
        System.out.println(rectangle.display());
    }
}
