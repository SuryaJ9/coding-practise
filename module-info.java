/**
 * 
 */
/**
 * 
 */
module Practise {
   public String longestPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        Arrays.sort(str);
        StringBuilder str1 = new StringBuilder();

        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();

        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] == last[i]) {
                str1.append(first[i]);
            } else {
                break; // Stop when a mismatch is found
            }
        }

        return str1.toString();
    }

    public static void main(String[] args) {
        Practise obj = new Practise();
        String[] str = {"jai", "jaya", "jay"};
        System.out.println("Longest prefix: " + obj.longestPrefix(str));
    }
}

}
