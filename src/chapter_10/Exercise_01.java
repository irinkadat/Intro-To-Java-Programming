package chapter_10;

public class Exercise_1 {
    // page 422
    public static void main(String[] args) {
        Time currentTime = new Time();
        Time customTime = new Time(555550000);

        System.out.println("Current Time: " + currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        System.out.println("Custom Time: " + customTime.getHour() + ":" + customTime.getMinute() + ":" + customTime.getSecond());
    }

}
