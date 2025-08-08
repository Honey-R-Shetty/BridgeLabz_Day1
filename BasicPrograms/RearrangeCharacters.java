package BasicPrograms;

public class RearrangeCharacters {
    public static String rearrange(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;
        int max = 0;
        for (int i = 1; i < 26; i++)
            if (freq[i] > freq[max])
                max = i;

        if (freq[max] > (s.length() + 1) / 2)
            return "Not possible";

        char[] res = new char[s.length()];
        int i = 0;

        while (freq[max]-- > 0) {
            res[i] = (char) (max + 'a');
            i += 2;
        }

        for (int j = 0; j < 26; j++) {
            while (freq[j]-- > 0) {
                if (i >= s.length())
                    i = 1;
                res[i] = (char) (j + 'a');
                i += 2;
            }
        }

        return new String(res);
    }

    public static void main(String[] args) {
        System.out.println(rearrange("aaabbc"));
    }
}

