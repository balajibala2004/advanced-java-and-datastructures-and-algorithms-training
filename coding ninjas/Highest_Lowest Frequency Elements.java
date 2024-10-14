import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Solution {
   
 public static int[] getFrequencies(int[] v) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : v) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
       }

        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;
        int maxFrequencyElement = Integer.MAX_VALUE; // Initialized to maximum value to find smallest element
        int minFrequencyElement = Integer.MAX_VALUE; // Initialized to maximum value to find smallest element

        // Iterate through the frequency map to find the elements with highest and lowest frequencies
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            // Update maxFrequency and maxFrequencyElement
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyElement = element;
            } else if (frequency == maxFrequency) {
                maxFrequencyElement = Math.min(maxFrequencyElement, element);
            }

            // Update minFrequency and minFrequencyElement
            if (frequency < minFrequency) {
                minFrequency = frequency;
                minFrequencyElement = element;
            } else if (frequency == minFrequency) {
                minFrequencyElement = Math.min(minFrequencyElement, element);
            }
        }
        int[] arr = {maxFrequencyElement, minFrequencyElement};
        return arr;
    }       
}
