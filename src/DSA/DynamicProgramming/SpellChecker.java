package DSA.DynamicProgramming;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SpellChecker {
    public static LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    public static void main(String[] args) {
        String referenceString="Would you tell me please, which way I ought to go from here" +
                "That depends a good deal on where you want to get to." +
                "I don't much care where" +
                "Then it doesnt matter which way you go";
        String regex="\\s|,|.";
        referenceString.replaceAll(regex," ");

        createTextCorpus(referenceString);
        Scanner in = new Scanner(System.in);
        String word= in.nextLine();
        System.out.println(checkWordValidity(word));
    }

    public static void createTextCorpus(String referenceString) {
        String[] strToArr = referenceString.split(" ");
        for (int i = 0; i < strToArr.length; i++) {
            if(map.containsKey(strToArr[i]))
                map.put(strToArr[i], map.get(strToArr[i])+1);
            else
                map.put(strToArr[i],1);

        }
    }

    public static boolean checkWordValidity(String word) {
        return map.containsKey(word);
    }
}
