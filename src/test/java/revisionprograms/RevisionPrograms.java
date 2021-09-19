package revisionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class RevisionPrograms {
    public static void main(String[] args) {
        additionUptoTen();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(55);
        numbers.add(191);
        numbers.add(74);
        numbers.add(52);
        sortNumbersAsc(numbers);
        highestNumber(numbers);
        lowestNumber(numbers);
    }

    public static void additionUptoTen() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
    }

    public static void sortNumbersAsc(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        for (Integer i : numbers)
            System.out.println(i);
        Collections.reverse(numbers);
        for (Integer i : numbers)
            System.out.println(i);
    }

    public static void highestNumber(ArrayList<Integer> numbers) {
        int highNum = 0;
        for (Integer i : numbers) {
            if (i > highNum)
                highNum = i;
        }
        System.out.println(highNum);
    }

    public static void lowestNumber(ArrayList<Integer> numbers) {
        int lowNum = 10000000;
        for (Integer i : numbers) {
            if (i < lowNum)
                lowNum = i;
        }
        System.out.println(lowNum);
    }

}
