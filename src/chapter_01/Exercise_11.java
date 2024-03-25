package chapter_01;

public class Exercise_11 {
    public static void main(String[] args){
        int currentP = 312032486;
        int yearInSeconds = 365*24*3600;
        int babyInYear = yearInSeconds / 7;
        int deathInYear = yearInSeconds / 13;
        int immigrantInYear = yearInSeconds / 45;
        for (int i = 1; i < 6; i++) {
            currentP = currentP + babyInYear + immigrantInYear - deathInYear;
            System.out.printf("Population after %d year: %d\n",i, currentP);
        }
    }

}
