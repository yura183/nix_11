package ua.com.alevel;

public class EndLessons {

    public static void endLessons(int lessons){
    int num = lessons * 45 + lessons / 2 * 5 + (lessons - 1) / 2 * 15;
    int hours = 9 + num / 60;
    int min = num % 60;

    System.out.println(hours+" : "+min);
}
}
