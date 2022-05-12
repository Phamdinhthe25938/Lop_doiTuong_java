public class B4_Lop_Fan {
    private int slow =1;
    private int medium =2;
    private int fast =3;
    private int  speed =1;
    private  boolean on=false;
    private int radius =5;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String inString(){
        if(this.on==true){
            return "Speed:"+this.speed+"color:"+this.color+"radius"+this.radius+",quat dang o trang thai:'on'";
        }
        else{
            return "color:"+this.color+"radius"+this.radius+",quat dang o trang thai:'off'";
        }
    }
}
