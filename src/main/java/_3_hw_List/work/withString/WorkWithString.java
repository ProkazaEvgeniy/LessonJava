package _3_hw_List.work.withString;

import java.util.*;

/**
 * Created by admin on 25.02.2016.
 */
public class WorkWithString {
    /**
     * @return {@code true} if length is {@code 0}, otherwise
     * {@code false};
     */
    public boolean isEmptyString(String toCheck) {
        return toCheck.length() == 0;
    }

    /**
     * Привет
     * @return {@code true} if string is number, otherwise
     * {@code false};
     */
    public boolean attendWithStringNumber(String toCheck) {
        return !toCheck.matches("^\\D*$");
    }

    /**
     *
     * @return {@code true} if string is pattern, otherwise
     * {@code false};
     */
    public boolean conformityStringPattern(String toCheck, String matcher) {
        return toCheck.matches(matcher);
    }

    /**
     */
    public String deleteAllSymbol(String toWork, String charToDelete) {
        return toWork.replaceAll(charToDelete, "");
    }

    /**
     */
    public List<String> createListString(String toWork, String delimiter) {
        return Arrays.asList(toWork.split(delimiter));
    }

    /**
     */
    public int howManyWordsInSentence(String toCheck) {
        return createListString(toCheck, " ").size();
    }

    /**
     */
    public String addCurrentDate(String toCheck) {
        Date date = new Date(System.currentTimeMillis());
        return toCheck + date.toString();
    }

    /**
     */
    public boolean checkInConformity(String toCheck1, String toCheck2) {
        return toCheck1.equals(toCheck2);
    }

    /**
     */
    public void repetitionInString(String toCheck) {
//        String alph = "ABCDEFGHIKLMNOPRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < alph.length(); i++) {
//            char letter = alph.charAt(i);
//            HashMap<Character, Integer> map = new HashMap<>();
//            for (int j = 0; j < toCheck.length(); j++) {
//                char c = toCheck.charAt(j);
//                if (Character.isLetter(c)) {
//                    if (map.containsKey(c)) {
//                        map.put(c, map.get(c) + 1);
//                    } else {
//                        map.put(c, 1);
//                    }
//                }
//            }
//            if (map.get(letter) == null) {
//            } else {
//                System.out.println("Repetition letter = " + letter + " - " + map.get(letter));
//            }
//        }
    }

    public void repetitionInString1(String toCheck) {
//        List<Character> charsList = new ArrayList<>();
//        for (int i = 0; i < toCheck.length(); i++) {
//            int count = 0;
//            char letter = toCheck.charAt(i);
//            for (int j = 0; j < toCheck.length(); j++) {
//                if (letter == toCheck.charAt(j)) {
//                    count++;
//                }
//            }
//            if (!charsList.contains(letter)) {
//                charsList.add(letter);
//                System.out.println("Repetition " + letter + " count = " + count);
//            }
//        }
    }

    /**
     */
    public String turoverString(String toCheck) {
        return new StringBuilder(toCheck).reverse().toString();
    }
}
