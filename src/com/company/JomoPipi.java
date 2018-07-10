package com.company;

import java.util.HashMap;

public class JomoPipi {

    private JomoPipi(){
        // no initial constructor instantiation
    }
    public static String numericals(String s) {
        String outputInt = "";
        //given an input string
        // if the string is the first character in the string, then replace it with a '1' else have the number of occurrences
        HashMap<Character, Integer> storeChars = new HashMap<>();
        for(int i = 0;i< s.length(); i ++){
            //iterate through the characters in the string
            // if key does not exist, add key and set value to 1
            // else, increase the value by 1
            int count = storeChars.containsKey(s.charAt(i)) ? storeChars.get(s.charAt(i)) : 0;
            storeChars.put(s.charAt(i),count+1);
            outputInt += Integer.toString(storeChars.get(s.charAt(i)));
        }
        return outputInt;
    }
}
