import java.util.ArrayList;

class ReverseString {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        // your code goes here
        int n = s.size();
        if (n == 0 || n == 1) return s;
        reversed(s, 0, n - 1);
        return s;
    }

    public void reversed(ArrayList<Character> s, int left, int right) {
        if (left >= right) return;
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);
        reversed(s, left + 1, right - 1);
    }
}
