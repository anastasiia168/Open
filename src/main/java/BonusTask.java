

public class BonusTask {

        public static void main(String[] args) {

            String OldWord = "boobooboo";
            char OldChar = "o".charAt(0);

            StringBuilder NewWord = new StringBuilder(OldWord);
            char NewChar = "i".charAt(0);
            for (int i=0; i<OldWord.length(); ++i)
                if(OldWord.charAt(i) == OldChar)
                    NewWord.setCharAt(i, NewChar);

            System.out.println("The new word is: "+NewWord);
        }
    }



