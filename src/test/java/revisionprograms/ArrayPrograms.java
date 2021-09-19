package revisionprograms;


import javax.print.DocFlavor;
import java.util.ArrayList;

public class ArrayPrograms {
    public static void main(String[] args) {
        int[] numbers = {20, 3, 8, 90, 56, 72, 2};
       // sumOfMultiplesOfFour(numbers);
        String str = "1oneday";
        //firstChar(str);
        dayOfTheWeek("Mon", 5);
    }

    public static void dayOfTheWeek(String str, int N) {
        ArrayList<String> day = new ArrayList<String>();
        int numberOfDays = 0;
        String dayip;
        day.add("Mon");
        day.add("Tue");
        day.add("Wed");
        day.add("Thu");
        day.add("Fri");
        day.add("Sat");
        day.add("Sun");
        System.out.println(day.get(day.indexOf(str) + (N % 7)));
    }

/*
    public static void firstChar(String str) {
        if (str.substring(0, 1).matches("[a-z]")) {

        }
    }

    public static void sumOfMultiplesOfFour(int[] num) {
        int sum = 0;
        for (int i : num) {
            System.out.println(i);
            if (i % 4 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
*/
    }