package ua.com.alevel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" FindNumb ");
        String str = scanner.nextLine();
        FindNumb.findNumb(str);
        System.out.print(" FindLiture ");
        str = scanner.nextLine();
        FindLiture.findLiture(str);
        System.out.print(" EndLessons ");
        int lesson = scanner.nextInt();
        EndLessons.endLessons(lesson);
    }
}
