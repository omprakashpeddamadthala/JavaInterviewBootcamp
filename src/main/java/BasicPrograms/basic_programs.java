package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class basic_programs {


    public static void main(String[] args) {

       // reverseString("I love my india");

      //  countNoOfWordsUsingHashMap("I love my india");

      //  System.out.println("isPalindrome ==>  "+isPalindrome("madams"));

     //   System.out.println("fibinocii ==> "+fibinocii(10));

     //   duplicateCharacterInString("Pravalika");

        int arry[] = {3,5,1,3,9,5,6,2,8,6,1,7};
        System.out.println( "second highest number ===>" +secondHighestNumberInArray(arry));

    }

    private static Integer secondHighestNumberInArray(int[] nums) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (Integer num :nums){
            if(num>highest){
                secondHighest = highest;
                highest = num;
            } else if (num>secondHighest && num !=highest) {
                secondHighest = num;
            }
        }
        return secondHighest;
    }

    private static void duplicateCharacterInString(String input) {
        HashMap<Character,Integer> charCount= new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault( c,0 ) + 1);
        }

        for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }

    private static long fibinocii(int num) {
        if (num <= 1) return num;
        return fibinocii( num-1 )+fibinocii( num -2 );
    }

    private static boolean isPalindrome(String word) {
        char[] ch = word.toCharArray();
        int left =0 ,right=word.length()-1;
        while (left<right){
            if(ch[left]!=ch[right]){
                return  false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static void countNoOfWordsUsingHashMap(String input) {
        String words[]= input.split( "\\s" );
        HashMap<String,Integer> wordCount = new HashMap<>();
        for (String word : words){
            wordCount.put( word,wordCount.getOrDefault( word ,0)+1 );
        }
        
        System.out.println("No of words are " + words.length);
        for (String word : wordCount.keySet()) {
            System.out.println("Word '" + word + "' is repeated " + wordCount.get(word) + " time(s)");
        }

    }

    private static void reverseString(String word) {
        System.out.println("Before reverse word "+word);
        System.out.println("After reverse word  "+reverStringWithoutInBuilt(word));

    }

    private static String reverStringWithoutInBuilt(String word) {
        char[] ch =word.toCharArray();
        int left =0,right =word.length()-1;
        while(left<right){
            char temp =ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }


}
