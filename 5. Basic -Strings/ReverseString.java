class ReverseString {
    public void reverseString(List<Character> s) {
        // your code goes here
        int left = 0, right = s.size() - 1;
        while (left < right) {
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);
            left++;
            right--;
        }
    }
}
