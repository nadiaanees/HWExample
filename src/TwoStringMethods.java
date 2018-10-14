public class TwoStringMethods {


    public static String alternateStrings(String phrase1, String phrase2) {
        String output = "";
        String shorterString = "";

        if (phrase1.length() < phrase2.length()) {
            shorterString = phrase1;
        } else if (phrase2.length() < phrase1.length()) {
            shorterString = phrase2;
        } else {
            shorterString = phrase1;
        }
        for (int i = 0; i < shorterString.length(); i++) {
            output += phrase1.substring(i, i + 1);
            output += phrase2.substring(i, i + 1);
        }
        if (phrase1.length() > phrase2.length()) {
            output += phrase1.substring(phrase2.length());
        }
        if (phrase2.length() > phrase1.length()) {
            output += phrase2.substring(phrase1.length());
        }

        return output;
    }

    public static boolean abcTest(String text) {

        for (int i = 0; i < text.length(); i++) {
            String firstLetter = text.substring(i, i + 1);
            if (firstLetter.equals(".")) {
                return false;
            }

            if (firstLetter.equals("a")) {
                if (text.substring(i + 1, i + 2).equals("b")) {
                    if (text.substring(i + 2, i + 3).equals("c")) {
                        return true;
                    }
                }
            }
             if(text.substring(i).equals("")){
                return false;
            }
        }
        return false;
    }

}
