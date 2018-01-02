import java.util.List;
import java.util.ArrayList;

public class FindAndReplace {
    public String findAndReplace(String sentence, String toFind, String toReplace) {
        String[] sentenceArr;
        boolean found = false;
        List<String> newSentenceArr = new ArrayList<String>();
        sentenceArr = sentence.split(" ");
        for (String word : sentenceArr) {
            if (toFind.equals(word)) {
                newSentenceArr.add(toReplace);
            } else {
                String[] wordArr = word.split("");
                String[] replaceArr = toReplace.split("");
                String[] findArr = toFind.split("");
                List<String> newWordArr = new ArrayList<String>();

                int i = 0;
                while (i < findArr.length && i < wordArr.length) {
//                for (int i = 0; i < findArr.length; i++) {
                    if (findArr[i].equals(wordArr[i])) {
                        found = true;
                    }
                    else {
                        found = false;
                    }
                    i++;
                }
                if (found) {
                    int j;
                    for (j = 0; j < replaceArr.length; j++) {
                        newWordArr.add(replaceArr[j]);
                    }
                    for (int k = j; k < wordArr.length; k++) {
                        newWordArr.add(wordArr[k]);
                    }
                }
//                if (found) {
//                    boolean trueWord = true;
//                    for (int p = 0; p < wordArr.length; p++) {
//                        for (int l = 0; l < replaceArr.length; l++) {
//                            trueWord = true;
//                            if (p + l < wordArr.length && !wordArr[p + l].equals(replaceArr[l])) {
//                                trueWord = false;
//                            }
//                        }
//                        if (trueWord) {
//                            for (String value : replaceArr) {
//                                newWordArr.add(value);
//                            }
//                        } else {
//                            newWordArr.add(wordArr[p]);
//                        }
//                    }
//                }
                if (!found) {
                    newSentenceArr.add(word);
                } else {
                    String newWord = "";
                    for (String s : newWordArr) {
                        newWord += s;
                    }
                    newSentenceArr.add(newWord);
                }
            }
        }
        String newSentence = String.join(" ", newSentenceArr);
        return newSentence;
    }
}