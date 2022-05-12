import java.util.Date;
import java.util.Random;

public class main_B3 {
    public static void main(String[] args) {
        B3_layTG thoiGian = new B3_layTG();
        int arr[]= new int[10];
        Random r = new Random();
        System.out.println(r);
        for(int i=0;i<10;i++){
             arr[i]= r.nextInt(10)+1;
        }
        for (int ar:arr){
            System.out.print(ar+" ");
        }
        System.out.println("start :"+thoiGian.getStartTime());
        thoiGian.getStartTime();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep:");
        for (int ar:arr){
            System.out.print(ar+" ");
        }
        thoiGian.setEndTime(System.currentTimeMillis());
        thoiGian.getEndTime();
        System.out.println("finish:"+thoiGian.getEndTime());
        System.out.println("thoi gian ham sap xep la :"+thoiGian.getElapsedTime());
    }
}
