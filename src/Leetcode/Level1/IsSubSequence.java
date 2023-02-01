package Leetcode.Level1;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class IsSubSequence {
    @Test
    public void checkAllSubSequence() {
        HashMap<String, String> map = new HashMap<>();
        map.put("abc","ahbgdc");
        map.put("ace","abcde");
        map.put("ab","baab");

        for (String s: map.keySet()) {
            boolean answer = isSubsequenceMoreTc(s,map.get(s));
            assertTrue(answer);
        }
        map.clear();
        map.put("axc","ahbgdc");
        map.put("ace","aec");
        map.put("aaa","aabb");
        map.put("aaa","aa");
        for (String s: map.keySet()) {
            boolean answer = isSubsequenceMoreTc(s,map.get(s));
            assertFalse(answer);
        }

    }

    public boolean isSubsequenceMoreTc(String s, String t) {
        int prevIndex=-1;
        if (s.length() > t.length())
            return false;
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                char str= s.charAt(i);
                char substr = t.charAt(j);
                if (str==substr && !list.contains(j)) {
                    if (j > prevIndex) {
                        prevIndex=j;
                        list.add(j);
                        break;
                    }
                }
            }
        }
        if (list.size()!=s.length())
            return false;
        return true;
    }

    public boolean isSubsequence(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.toCharArray().length; i++)
            map1.put(s.charAt(i), i);

        for (int i = 0; i < t.toCharArray().length; i++) {
            char substr = t.charAt(i);
            if (map1.containsKey(substr)) {
                map2.put(substr,map1.get(substr));
                map1.remove(substr);
            }
        }

        if (map1.size() > 0)
            return false;

        int[] values=new int[map2.size()];
        for (int i = 0; i < map2.size(); i++) {
            values[i]=map2.get(i);
        }

        int[] copy=values;
        Arrays.sort(values);
        return copy == values? true: false;
    }
}
