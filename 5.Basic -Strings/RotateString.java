class RotateString {
    public boolean rotateString(String s, String goal) {
        // your code goes here
        if (s.length() != goal.length()) {
            return false;
        }
        String doubledS = s + s;
        return doubledS.contains(goal);
    }
}
