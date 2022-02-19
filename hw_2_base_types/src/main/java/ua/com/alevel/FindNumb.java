package ua.com.alevel;

public class FindNumb {

    public static void findNumb(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
