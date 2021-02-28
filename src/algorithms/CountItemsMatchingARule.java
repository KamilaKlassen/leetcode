package algorithms;

import java.util.List;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> list : items) {
            if (ruleKey.equals("type")) {
                if (list.get(0).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("color")) {
                if (list.get(1).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("name")) {
                if (list.get(2).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}
