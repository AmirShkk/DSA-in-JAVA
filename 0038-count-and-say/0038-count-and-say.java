class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";

        String str = countAndSay(n - 1);

        //now do the actual RLE on str
        int index = 0;
        StringBuilder sb = new StringBuilder();

        while (index < str.length()) {
            char ch = str.charAt(index);
            int freq = 0;

            while(index < str.length() && str.charAt(index) == ch) {
                index++;
                freq++;
            }

            //now form the sb
            sb.append((char) ('0' + freq));
            sb.append(ch);
        }

        return sb.toString();
    }
}