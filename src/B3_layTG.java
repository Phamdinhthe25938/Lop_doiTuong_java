import java.util.Date;

public class B3_layTG {
     private long startTime ;
     private long endTime;
     public long getStartTime() {
          this.startTime = System.currentTimeMillis();
          return this.startTime;
     }

     public void setEndTime(long endTime) {
          this.endTime = endTime;
     }

     public long getEndTime () {
//          this.endTime = System.currentTimeMillis();
          return this.endTime;
     }
     public long getElapsedTime(){
          return getStartTime()-getEndTime();
     }
}