package untitled.src;

import java.util.*;

/**
 * The test class WordleAITest.
 *
 * @author  Max Ward
 */
public class WordleAITest
{

    public void testGuessContains()
    {
        System.out.println(WordleAI.guessContains("test", 't'));
        System.out.println(WordleAI.guessContains("test", 'e'));
        System.out.println(WordleAI.guessContains("test", 'f'));
    }

    public void testIsAllStars()
    {
        System.out.println(WordleAI.isAllStars("***"));
        System.out.println(WordleAI.isAllStars("*"));
        System.out.println(WordleAI.isAllStars("*a*"));
        System.out.println(WordleAI.isAllStars("a"));
    }

    public void testIsConsistent()
    {
        System.out.println(WordleAI.isConsistent("dxaxx", "*_.__", "dairy"));
        System.out.println(WordleAI.isConsistent("daddy", "*_.__", "dairy"));

        System.out.println(WordleAI.isConsistent("cat", ".._", "acz"));
        System.out.println(WordleAI.isConsistent("cat", ".._", "act"));
    }


    public static void main (String[] args)
    {
        String[] words = {"hit", "log", "ate", "cat", "axe"};
        WordleDictionary dict = new WordleDictionary(new ArrayList<>(Arrays.asList(words)));

        WordleGame game = new WordleGame("log");
        ArrayList<String> guesses = new ArrayList<>();

        WordleAIAnalyser analyser = new WordleAIAnalyser(new WordleDictionary(), 5);
        analyser.runExperimentsWithAllWords();
        guesses = analyser.getUnsolvedWords();
//        int[] array = analyser.getNumGuessesFrequency();
//        for (int i=0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }


//        for (int i=0; i<analyser.getExperimentResults().size(); i++) {
//        System.out.println(analyser.getExperimentResults().get(i) + " ");
//        }
//
        //analyser.printHistogram(50);
//        guesses = WordleAI.findWord(dict, game);
        for (int i=0; i<guesses.size(); i++) {
            System.out.println(guesses.get(i) + " ");
        }

//        game = new WordleGame("log");
//        guesses = WordleAI.findWord(dict, game);
//        System.out.println(new String[] {"ate", "log"}, guesses.toArray());
//
//        words = new String[] {"ate", "bat", "cat"};
//        dict = new WordleDictionary(new ArrayList<>(Arrays.asList(words)));
//
//        game = new WordleGame("cat");
//        guesses = WordleAI.findWord(dict, game);
////        System.out.println(new String[] {"ate", "bat", "cat"}, guesses.toArray());
//        for (int i=0; i<guesses.size(); i++) {
//            System.out.println(guesses.get(i) + " ");
//        }
//

//        words = new String[] {"cat", "bat", "ate"};
//        dict = new WordleDictionary(new ArrayList<>(Arrays.asList(words)));
//
//        game = new WordleGame("cat");
//        guesses = WordleAI.findWord(dict, game);
////        System.out.println(new String[] {"ate", "bat", "cat"}, guesses.toArray());
//        for (int i=0; i<guesses.size(); i++) {
//            System.out.println(guesses.get(i) + " ");
//        }


//        words = new String[] {"acat", "abat", "aate"};
//        dict = new WordleDictionary(new ArrayList<>(Arrays.asList(words)));
//
//        game = new WordleGame("acat");
//        guesses = WordleAI.findWord(dict, game);
////        System.out.println(new String[] {"aate", "abat", "acat"}, guesses.toArray());
//        for (int i=0; i<guesses.size(); i++) {
//            System.out.println(guesses.get(i) + " ");
//        }


//        words = new String[] {"aaa","baa", "bba", "dda", "eea", "ffa", "gga", "hha"};
//        dict = new WordleDictionary(new ArrayList<>(Arrays.asList(words)));
//
//        game = new WordleGame("ca");
//        guesses = WordleAI.findWord(dict, game);
////        System.out.println(new String[] {"aa", "ba", "ca"}, guesses.toArray());
//        for (int i=0; i<guesses.size(); i++) {
//            System.out.println(guesses.get(i) + " ");
//        }
//
//        game = new WordleGame("hha");
//        guesses = WordleAI.findWord(dict, game);
////        System.out.println(new String[] {"aa", "bb", "cb"}, guesses.toArray());
//        for (int i=0; i<guesses.size(); i++) {
//            System.out.println(guesses.get(i) + " ");
//        }

//        game = new WordleGame("ca");
//        guesses = WordleAI.findWord(dict, game);
//        System.out.println(new String[] {"aa", "ba", "ca"}, guesses.toArray());
//        for (int i=0; i<guesses.size(); i++) {
//            System.out.println(guesses.get(i) + " ");
//        }

    }
}
