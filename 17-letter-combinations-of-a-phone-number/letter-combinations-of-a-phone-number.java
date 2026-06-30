import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        
        // Base case: if the input string is empty, return an empty list
        if (digits == null || digits.length() == 0) {
            return results;
        }
        
        // Use an array mapping where index matches the digit character
        String[] phoneMap = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        
        // Start the recursive backtracking helper function
        backtrack(0, new StringBuilder(), digits, phoneMap, results);
        return results;
    }
    
    private void backtrack(int index, StringBuilder currentCombination, String digits, String[] phoneMap, List<String> results) {
        // Base case: if the current combination length matches digits length, we found a combination
        if (currentCombination.length() == digits.length()) {
            results.add(currentCombination.toString());
            return;
        }
        
        // Get the letters corresponding to the current digit
        char currentDigit = digits.charAt(index);
        String letters = phoneMap[currentDigit - '0']; // Convert char digit to integer index
        
        // Loop through the letters and backtrack
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            currentCombination.append(letter);                  // Add the letter (Push)
            backtrack(index + 1, currentCombination, digits, phoneMap, results); // Recurse
            currentCombination.deleteCharAt(currentCombination.length() - 1);    // Remove the letter (Pop)
        }
    }
}
