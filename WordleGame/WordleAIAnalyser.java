import java.util.*;
import java.util.ArrayList;

/**
 * Analyses a WordleAI by running experiments and computing statistics.
 *
 * @author 20655568 AND 23453899
 */
public class WordleAIAnalyser
{
    // Do not modify the fields of this class.
    private WordleDictionary dictionary;
    private int wordLength;
    // You should read but NOT modify the WordleExperimentResult class
    private ArrayList<WordleExperimentResult> experimentResults;

    /**
     * Constructor takes a dictionary and word length to run experiments with.
     */
    public WordleAIAnalyser(WordleDictionary dictionary, int wordLength)
    {
        // TODO 5
        this.dictionary = dictionary;
        this.wordLength = wordLength;
        experimentResults = new ArrayList<WordleExperimentResult>();
    }

    /**
     * !!! DO NOT MODIFY !!!
     * This method has been implemented for you.
     */
    public ArrayList<WordleExperimentResult> getExperimentResults()
    {
        return experimentResults;
    }

    /**
     * Runs an experiment on a word and stores the result in experimentResults.
     * An experiment is the WordleExperimentResult from using the WordleAI on a WordleGame
     * with word as the secret word.
     *
     * No checks or guards are needed on the word parameter.
     * It is always assumed to be the right length and to come from the dictionary.
     */
    public void runExperiment(String word)
    {
        experimentResults.add(new WordleExperimentResult(word,WordleAI.findWord(dictionary,new WordleGame(word))));
    }

    /**
     * Runs and stores experiments for each word in the dictionary with the right length.
     *
     * Should call runExperiment once for each word.
     */
    public void runExperimentsWithAllWords()
    {
        // Stores the list of words in the dictionary in an arraylist
        ArrayList <String> words = dictionary.getWordsWithLength(wordLength);
        for (int i=0; i<words.size(); i++) {
            // run experiments for each word in the dictionary
            runExperiment(words.get(i));
        }
    }

    /**
     * Runs and stores experiments for each word in the dictionary with the right length.
     *
     * Only uses words that are lexicographically between the start and finish.
     * A word is only used if it is the same as start or comes after AND it is the same as finish or comes before.
     *
     * For example, if our words are "act", "bat", "bet", "cat"
     * Then runExperimentsWithWordsBetween("baa", "caa")
     * would only run experiments for "bat" and "bet"
     *
     * Should call runExperiment once for each word.
     *
     * HINT: Recall the String compareTo method.
     */
    public void runExperimentsWithWordsBetween(String start, String finish)
    {
        // store the list of words in the dictionary in an ArrayList and sort the words
        ArrayList <String> words = dictionary.getWordsWithLength(wordLength);
        ArrayList<String> wordsInBetween = new ArrayList<>();
        Collections.sort(words);
        // store the words lexicographically between the start and finish in an ArrayList
        for (int i=0; i<words.size(); i++) {
            if (start.compareTo(words.get(i)) < 0 && words.get(i).compareTo(finish) < 0) {
                wordsInBetween.add(words.get(i));
            }
        }
        // runs and store experiments for each selected word
        for (int j=0; j<wordsInBetween.size(); j++) {
            runExperiment(wordsInBetween.get(j));
        }
    }

    /**
     * Returns a list of all experiment words that were not solved by WordleAI.
     * The returned list of words should be in lexicographic order.
     *
     * There may be duplicates in experimentResults.
     * This method should NOT return any duplicated words!
     *
     * HINT 1: Remeber that findWord returns null when it cannot solve the word.
     * HINT 2: See Collections.sort and the ArrayList contains method.
     */
    public ArrayList<String> getUnsolvedWords()
    {
        // Creating 2 Arrays to be used, one for adding unsolved words and the other for temporary use
        ArrayList<String> unsolvedWords = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        // Loops through experimentResults, makes temp = to the guesses of experimentResults of i 
        for (int i = 0; i < experimentResults.size(); i++) {
            temp = experimentResults.get(i).getGuesses();
            // Checks if temp is == null and therefore if the word is unsolved and adds it to the array
            if (temp == null) {
                unsolvedWords.add(experimentResults.get(i).getWord());
            }
        }
        // Clears list of duplicates by converting to set and back, then sorts unsolvedWords lexicographically
        Set<String> set = new HashSet<>(unsolvedWords);
        unsolvedWords.clear();
        unsolvedWords.addAll(set);
        Collections.sort(unsolvedWords);
        return unsolvedWords;
    }

    /**
     * Returns an array with length 26.
     * The entry at index [0] is the number of 'a' characters guessed over all experiments by WordleAI.
     * The entry at index [1] is the number of 'b' characters.
     * ...
     * The entry at index [25] is the number of 'z' characters.
     *
     * For example, if the WordleAI guessed the words "cat"+"hat" in one experiment and "log"+"cat" in another:
     * The return array would be {3, 0, 2, ... }
     * Which means 3 'a' characters, 0 'b' characters, 2 'c' characters, and so on...
     *
     * HINT: Unsolved words have no guesses and should be skipped.
     */
    public int[] getGuessLetterFrequency()
    {
        // create an array to be returned, with length 26
        int[] array = new int[26];
        // create an arraylist to store all the words guessed in the experimentResults
        ArrayList<String> words = new ArrayList<>();
        // looping through to add all the words while avoiding unsolved words
        for (int i=0; i<experimentResults.size(); i++) {
            if (!experimentResults.contains(null)) {
                words.add(experimentResults.get(i).getWord());
            }
        }
        // looping through each word in the arrayList to count the number of characters and store in the array indices
        for (int j=0; j<words.size(); j++) {
            for (int k=0; k<words.get(j).length(); k++) {
                // loops through all unicode values for letters until correct and then increments that letters corresponding array value
                for (int l = 97; l < 123; l++) {
                    if (words.get(j).charAt(k) == l){
                        array[l-97] += 1;
                    }
                }
            }
        }
        return array;
    }

    /**
     * Returns an array of length 7.
     *
     * The entry at index [0] is the number of times the WordleAI guessed a word correctly after 1 guess.
     * The entry at index [1] is the number of times exactly 2 guesses were needed.
     * and so on.
     * The entry at index [6] is the number of times the WordleAI did not correctly guess the word.
     */
    public int[] getNumGuessesFrequency()
    {
        // creates temp arrayList and an Array of size 7
        ArrayList<String> temp = new ArrayList<>();
        int[] array = new int[7];
        // sets temp to be list of word guessed from experimentResults at i
        for (int i = 0; i < experimentResults.size(); i++){
            temp = experimentResults.get(i).getGuesses();
            // checks first to see if the world has been solved
            if (temp == null) {
                array[6] += 1;
            }
            // checks number of guesses used and adds 1 to corresponding index
            else {
                array[temp.size() - 1] += 1;
            }
        }
        return array;
    }

    /**
     * Makes a string containing a histogram picture of getNumGuessesFrequency().
     *
     * A possible histogram might look like this:
     *     ..*....
     *     ..*..*.
     *     .**.**.
     *     .*****.
     *     ******.
     *
     * The stars form bars in a histogram, and the dots represent empty space.
     * This would correspond to a frequency table of {1, 3, 5, 2, 3, 4, 0}
     * Recall that the newline '\n' character can be used to encode a line break in a string.
     * Note that return string should end with a newline '\n' character.
     *
     * Because the numbers can be large, we use a bucketSize.
     * The height of a bar in the chart is 0 if the corresponding number is in the inclusive range from 0 to bucketSize-1
     * The height is 1 if the number is in the inclusive range from bucketSize to bucketSize*2-1
     * The height is 2 if the number is in the inclusive range from bucketSize*2 to bucketSize*3-1
     * ...and so on.
     *
     * The height of the histogram should be the same as the height of the tallest bar.
     *
     */
    public String makeHistogram(int bucketSize)
    {
        // creating variable for later use and brings in getNumGuessFrequency array
        int height = 0;
        int[] numberFrequency = new int[7];
        String histogram = "";
        numberFrequency = getNumGuessesFrequency();
        // divides all values by bucket size
        for (int i = 0; i < numberFrequency.length; i++)
        {
            numberFrequency[i] = numberFrequency[i] / bucketSize;
        }
        // checks what the height of the histogram will be and sets that as tempHeight
        for (int i = 0; i < numberFrequency.length; i++)
        {
            if (height < numberFrequency[i])
            {
                height = numberFrequency[i];
            }
        }
        int tempHeight = height;
        // for loop that adds a new line and subtracts 1 from tempHeight 
        for (int j = 0; j < height; j++)
        {
            // checks if either a * or . is meant to be drawn and adds that to string
            for (int k = 0; k < numberFrequency.length; k++)
            {
                if (numberFrequency[k] - tempHeight >= 0){
                    histogram += "*";
                }
                else {
                    histogram += ".";
                }
            }
            histogram += "\n";
            tempHeight -= 1;
        }
        return histogram;
    }


    /**
     * Prints the string made by makeHistogram(bucketSize)
     *
     * The following code:
     * WordleAIAnalyser analyser = new WordleAIAnalyser(new WordleDictionary(), 5);
     * analyser.runExperimentsWithAllWords();
     * analyser.printHistogram(50);
     *
     *
     * Should print this to the terminal:
     *   ...*...
     *   ...*...
     *   ...*...
     *   ..**...
     *   ..**...
     *   ..***..
     *   ..***..
     *   ..***..
     *   ..***..
     *   .*****.
     */
    public void printHistogram(int bucketSize)
    {
        // No need to modify this method!
        // It has been provided for you.
        System.out.println(makeHistogram(bucketSize));
    }
}