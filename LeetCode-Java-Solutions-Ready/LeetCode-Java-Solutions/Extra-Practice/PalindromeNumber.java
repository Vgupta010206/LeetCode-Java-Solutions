// LeetCode 9 - Palindrome Number
// This was already present in the original repository.
// Approach: Reverse the digits and compare the result with the original number.

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        long reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }
}

// Time Complexity: O(d) - d is the number of digits.
// Space Complexity: O(1) - only a few variables are used.
