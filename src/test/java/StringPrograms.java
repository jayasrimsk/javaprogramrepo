import java.util.ArrayList;
import java.util.Collections;

public class StringPrograms {
    public static void main(String[] args) {
        String name1 = "mayalam";
        String name2 = "ascter";
        lengthOfString(name1);
        compareTwoStrings(name1, name2);
        isAnagram(name1, name2);
        isPalyndrome(name1);
        firstLetterCapital(name1);
    }

    public static void lengthOfString(String str) {
        System.out.println("The length of String is" + str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i, i + 1));
        }
        System.out.println(str.substring(0, 1));
    }

    public static void compareTwoStrings(String str1, String str2) {
        int result = str1.compareToIgnoreCase(str2);
        if (result >= 0) {
            System.out.println("Both Strings are equal");
        } else
            System.out.println("Both strings are not equal");
        System.out.println(str1.concat(str2));
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    public static void isAnagram(String str1, String str2) {
        ArrayList<Character> chararray1 = new ArrayList<Character>();
        ArrayList<Character> chararray2 = new ArrayList<Character>();
        for (int i = 0; i < str1.length(); i++) {
            chararray1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            chararray2.add(str2.charAt(i));
        }
        Collections.sort(chararray1);
        Collections.sort(chararray2);
        if (chararray1.equals(chararray2)) {
            System.out.println("Both strings are anagram");
        } else
            System.out.println("Both Strings are not anagram");
    }
    public static void isPalyndrome(String str){
        ArrayList<Character> charArray = new ArrayList<Character>();
        ArrayList<Character> charArrayRev = new ArrayList<Character>();
        for(Character i:str.toCharArray()){
            charArray.add(i);
            charArrayRev.add(i);
        }
        Collections.reverse(charArrayRev);
        if(charArray.equals(charArrayRev)){
            System.out.println("The string is palyndrome.");
        }
        else{
            System.out.println("The string is not a Palyndrome");
        }

    }
    public static void firstLetterCapital(String str){
        String capsName = str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.println(capsName);
    }
}
