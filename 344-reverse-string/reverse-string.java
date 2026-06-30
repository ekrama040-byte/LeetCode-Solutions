class Solution {
    public void reverseString(char[] s) {
        attributes(s, 0, s.length - 1);
    }
    private void attributes(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = s[right];
        s[right] = s[left];
        s[left] = temp;
        attributes(s, left + 1, right - 1);
    }
}

