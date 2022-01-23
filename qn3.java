public class qn3 {
    public static void main(String[] args){
        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis / 1000;
        int currentSecond = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int currentMinute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        int currentHour = (int)(totalHours % 24);
        System.out.println(String.format("Current time is %d:%d:%d GMT", currentHour, currentMinute, currentSecond));
    }
}
