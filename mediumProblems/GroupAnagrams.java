package mediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char [] ourWord = word.toCharArray();
            Arrays.sort(ourWord);
            String tempWord = new String(ourWord);

            if (!map.containsKey(tempWord)) {
                map.put(tempWord, new ArrayList<>());
            }

            map.get(tempWord).add(word);

        }

        return new ArrayList<>(map.values());
    }
}
