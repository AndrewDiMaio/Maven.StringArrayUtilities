package com.zipcodewilmington;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        for (int i = 0; i < array.length; i++){
            reverseArray[array.length-1-i]=(array[i]);
        }

        return reverseArray;
    }
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseArray = new String[array.length];
        for (int i = 0; i < array.length; i++){
            reverseArray[array.length-1-i]=(array[i]);
        }

        if (Arrays.equals(reverseArray,array)){
            return true;
        }else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
       String test = Arrays.toString(array);

    test = test.toLowerCase();
    test = test.replaceAll(",", "");
    test = test.replaceAll(" ", "");
    System.out.println(test);
    int count = 0;
    for(char c = 'a';c <= 'z'; ++c) {
            if(!test.contains(String.valueOf(c))) {
                String n = Character.toString(c);

            }else{
                count++;
            }
        }
    System.out.println(count);
        if (count == 26){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == value){
                count++;
            }
        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String a[]=new String[array.length-1];
    int count = 0;
    for (int i = 0; i<array.length; i++)

        if (array[i].equals(valueToRemove)) {
            System.out.println(array[i]);
        } else {
                System.out.println(array[i]+"new");
                a[count] = array[i];
                count++;
            }
    return a;
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String a[]=new String[array.length];
        int count = 0;
        for (int i = 0; i<array.length; i++)

            if (i == 0) {
                a[count] = array[i];
                count++;
            }else if (array[i].equals(array[i-1]))
             {
            } else {
                a[count] = array[i];
                count++;
            }

        String finalArray[] = new String[count];
            for (int i = 0; i<count;i++){
                finalArray[i] = a[i];
            }

        return finalArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String a[]=new String[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0){
                a[0] = array[0];
                count++;
            }else if (array[i].equals(array[i-1])){
                a[count-1] += (array[i]);
            }else {
                a[count] = array[i];
                count++;
            }

        }
        String finalArray[] = new String[count];
        for (int i = 0; i<count;i++){
            finalArray[i] = a[i];
        }

        return finalArray;


    }
}
