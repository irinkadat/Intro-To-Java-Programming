package chapter_09;

public class Exercise_02 {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");

        oracle.setPreviousPrice(34.5);
        oracle.setCurrentPrice(34.35);

        System.out.printf("Price change percentage: %.2f%%\n", oracle.getChangePercent());
    }

}
