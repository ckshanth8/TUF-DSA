class LongestCommonPrefix {
    public String longestCommonPrefix(String[] str) {
        // your code goes here
        if (str == null || str.length == 0) return "";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            String current = str[i];
            int j = 0;
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }
}
