package ua.com.alevel;

public class EndLessons {

    private static final int VAR_1 = 1;
    private static final int VAR_2 = 2;
    private static final int VAR_5 = 5;
    private static final int VAR_9 = 9;
    private static final int VAR_10 = 10;
    private static final int VAR_15 = 15;
    private static final int VAR_45 = 45;
    private static final int VAR_60 = 60;

    public static void endLessons(int lessons){
    int num = lessons * 45 + lessons / 2 * 5 + (lessons - 1) / 2 * 15;
    int hours = 9 + num / 60;
    int min = num % 60;

    System.out.println(hours+" : "+min);
}
}
