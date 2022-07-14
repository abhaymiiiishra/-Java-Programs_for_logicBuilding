
/*
Write a program to accept a sentence which may be terminated by either’.’ ,’?’or ‘!’only. The words are to be separated by a single blank space in uppercase. Check for the validity of the sentence and convert the non- palindrome words by concatenating the words by its reverse( excluding the last character ).Display the original sentence along with the converted sentence . INPUT : THE BIRD IS FLYING. OUTPUT : THEHT BIRDRIB ISI FLYINGNIYLF
*/
import java.util.*; // importing scanner class

class PalindromeSentence { // class opened
    String revStr(String s) // returns the reverse of the word
    {
        String p = "";
        for (int i = 0; i < s.length() - 1; i++) {
            p = s.charAt(i) + p;
        }
        return p;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        PalindromeSentence Ps = new PalindromeSentence();
        String s, w, p = "";
        System.out.println("Enter the sentence");
        s = sc.nextLine();
        s = s.toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            w = st.nextToken();
            if (w.equals(Ps.revStr(w)))
                p = p + w;
            else
                p = p + w + Ps.revStr(w) + " ";
        }
        p = p.trim();
        System.out.println("ORIGINAL STRING:" + s);
        System.out.println("UPDATED STRING:" + p);
    }
}
