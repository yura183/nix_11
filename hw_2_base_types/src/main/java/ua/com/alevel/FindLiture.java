package ua.com.alevel;

public class FindLiture {

    public static void findLiture(String s){

        char[] myArray = s.replaceAll("[^^A-Za-zА-Яа-я]", "").toLowerCase().toCharArray();
        int n = 0;
        for(int i=0; i<myArray.length-1; i++){
            for (int j=i+1; j<myArray.length; j++){
                if(myArray[i] == myArray[j]){
                    n++;
                }
            }
        }
        int[] counter = new int[256];

        String str1 = String.valueOf(myArray);
        int length = str1.length();

        for (int i = 0; i < length; i++) {
            counter[str1.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " - " + counter[i]);
            }
        }
    }
}
