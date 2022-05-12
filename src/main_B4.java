public class main_B4 {
    public static void main(String[] args) {
         B4_Lop_Fan fan1 = new B4_Lop_Fan();
         B4_Lop_Fan fan2 = new B4_Lop_Fan();
         fan1.setSpeed(3);
         fan1.setColor("yellow");
         fan1.setOn(true);
         fan1.setRadius(10);
         System.out.println(fan1.inString());
         fan2.setRadius(5);
         fan2.setFast(2);
         fan2.setOn(false);
         fan2.setColor("blue");
        System.out.println(fan2.inString());
    }
}
