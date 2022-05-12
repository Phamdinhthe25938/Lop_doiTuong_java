import java.util.Scanner;

public class main_B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Nhap a:");
        a = sc.nextInt();
        System.out.println("Nhap b:");
        b = sc.nextInt();
        System.out.println("Nhap c:");
        c = sc.nextInt();
        B2_Giai_ptr ketQua = new B2_Giai_ptr(a, b,c);
        ketQua.getA();
        ketQua.getB();
        ketQua.getC();
        if(ketQua.getDiscriminant()>0){
            System.out.println("nghiem x1:"+ketQua.getRoot1());
            System.out.println("nghiem x2:"+ketQua.getRoot2());
        }
        else if(ketQua.getDiscriminant()<0){
            System.out.println(ketQua.voNghiem());
        }
        else if(ketQua.getDiscriminant()==0){
            System.out.println("ptr co nghiem kep :"+ketQua.nghiemKep());
        }
    }
}
