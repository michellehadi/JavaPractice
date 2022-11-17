import java.util.*;
public class test {
    ArrayList<String> words = new ArrayList<>();
    public String getRandomWord(int length) {
        words.add("cat");
        words.add("abc");
        words.add("bump");
        words.add("test");
        Random num = new Random();
        ArrayList<String> words_random = new ArrayList<>();
        for (int i=0; i<words.size(); i++) {
            if (words.get(i).length() == length) {
                words_random.add(words.get(i));
            }
        }
        String randomWord = words_random.get(num.nextInt(words_random.size()));
        return randomWord;
    }

    public static boolean guessContains(String guess, char c) {
        for (int i=0; i<guess.length(); i++) {
            if (guess.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
    public static boolean guessAsterisk(String guess) {
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) != '*') {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsistent(String previousGuess, String result, String newGuess)
    {
        // TODO 2
        int prevNumStar = 0;
        int prevNumDot = 0;
        int prevNumLine = 0;
        int numStar = 0;
        int numDot = 0;
        int numLine = 0;
        for (int j=0; j<result.length(); j++) {
            if (result.charAt(j) == '*') {
                prevNumStar += 1;
            }
            else if (result.charAt(j) == '.') {
                prevNumDot += 1;
            }
            else if (result.charAt(j) == '+') {
                prevNumLine += 1;
            }
        }
        System.out.println(prevNumStar + " " + prevNumDot + " " + prevNumLine);
        for (int i=0; i<newGuess.length(); i++) {
            if (newGuess.charAt(i) == previousGuess.charAt(i)) {
                numStar += 1;
            }
            else if (newGuess.charAt(i) != previousGuess.charAt(i) && guessContains(previousGuess,newGuess.charAt(i)) == true) {
                numDot += 1;
            }
            else if (newGuess.charAt(i) != previousGuess.charAt(i) && guessContains(previousGuess,newGuess.charAt(i)) == false) {
                numLine += 1;
            }
        }
        if (prevNumStar == numStar) {
            if (prevNumDot == numDot && prevNumLine == numLine) {
                return true;
            }
            else return false;
        }
        return false;
    }

    public static ArrayList<String> findWord(ArrayList<String> dictionary, ArrayList<String> game)
    {
        // TODO 4
        ArrayList <String> words = dictionary;
        ArrayList <String> wordsGuessed = new ArrayList<>();

        ArrayList <String> sortedWords = dictionary.getWordsWithLength(game.getWordLength());
        Collections.sort(sortedWords);

        String smallestWord = sortedWords.get(0);
        String result1 = game.guessWord(smallestWord);
        if (isAllStars(result1)) {
            wordsGuessed.add(smallestWord);
        }
        else {
            for (int i=0; i<words.size(); i++) {
                // check if the word equals to the lexicographically smallest word
                if (words.get(i).equals(smallestWord)) {
                    // do nothing and proceed with the next iteration to check the next word
                }
                else {
                    if (isConsistent(smallestWord,result1,words.get(i))) {
                        result1 = game.guessWord(words.get(i));
                        if (isAllStars(result1) == true) {
                            wordsGuessed.add(words.get(i));
                            return wordsGuessed;
                        }
                        if (words.get(i).compareTo(smallestWord) < 0) {
                            smallestWord = words.get(i);
                        }
                    }
                }
            }
        }
        return wordsGuessed;
    }
    public static void main(String[] args) {
        //test object = new test();
        //System.out.println(object.getRandomWord(4));
        System.out.println(isConsistent("dxaxx","*_.__","dairy"));
        }
    }