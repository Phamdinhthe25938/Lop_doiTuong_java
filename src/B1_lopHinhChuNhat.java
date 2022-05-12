public class B1_lopHinhChuNhat {
    private int heght;
    private int witdh;
    public B1_lopHinhChuNhat(int heght,int witdh){
        this.heght=heght;
        this.witdh=witdh;
    }
    public int getHeght() {
        return heght;
    }

    public void setHeght(int heght) {
//        xu ly logic
        if(heght<0){
            return;
        }
        this.heght = heght;
    }

    public int getWitdh() {
        return witdh;
    }

    public void setWitdh(int witdh) {
        this.witdh = witdh;
    }
    public int getArea(){
        int area;
        area = this.heght*this.witdh;
        return area;
    }
    public int getPerimeter(){
        int perimeter;
        perimeter =(this.heght+this.witdh)*2;
        return perimeter;
    }
    public String display() {
        return "Rectangle{" + "width=" + this.witdh + ", height=" + this.heght + "}";
    }
}
