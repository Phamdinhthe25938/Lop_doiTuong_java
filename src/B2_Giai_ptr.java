public class B2_Giai_ptr {
    private double a;
    private double b;
    private double c;
    public B2_Giai_ptr(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double  getDiscriminant(){
        double delta ;
        delta = this.b*this.b-4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double x1;
             x1= (-this.b+Math.sqrt(getDiscriminant()))/2*a;
             return x1;
    }
    public double getRoot2(){
        double x2;
        x2= (-this.b-Math.sqrt(getDiscriminant()))/2*a;
        return x2;
    }
    public String voNghiem(){
        return "ptr vo no";
    }
    public double nghiemKep(){
        return -this.b/this.a;
    }
}
