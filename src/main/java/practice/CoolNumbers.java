package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        char[] carLetters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        List<String> coolnumbers = new ArrayList<>();
        String numberCar = "";
        for (char letter : carLetters) {
            for (int figure = 0; figure < 10; figure++) {
                for (char letter_2 : carLetters) {
                    for (char letter_3 : carLetters) {
                        for (int m = 1; m <= 199; m++) {
                            if (m < 10) {
                                numberCar = letter + figure + "" + figure + "" + figure + letter_2 + letter_3 + "0" + m;
                                coolnumbers.add(numberCar);
                            } else {
                                numberCar = String.format("%s%d%d%d%s%s%d", letter, figure, figure, figure, letter_2, letter_3, m);
                                coolnumbers.add(numberCar);
                            }
                        }
                    }
                }
            }
        }
        return coolnumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        if (list.contains(number)){
            return true;
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        int index = Collections.binarySearch(sortedList, number);
        if (index == -1){
            return false;
        } else {
            return true;
        }
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        if (hashSet.contains(number)){
            return true;
        }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        if (treeSet.contains(number)){
            return true;
        }
        return false;
    }

}
