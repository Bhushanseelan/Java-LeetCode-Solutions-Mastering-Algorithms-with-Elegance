class Solution {
    public boolean isValid(String word) {
        // Condition 1: Check if the length of the word is at least 3 characters
        if (word.length() < 3) {
            return false;
        }
        
        // Condition 2: Check if the word contains at least one vowel and one consonant
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                hasVowel = true;
            } else if (Character.isLetter(c)) {
                hasConsonant = true;
            }
            if (hasVowel && hasConsonant) {
                break;
            }
        }
        if (!hasVowel || !hasConsonant) {
            return false;
        }
        
        // Condition 3: Check if the word consists only of digits, uppercase and lowercase English letters
        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
    
    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}
