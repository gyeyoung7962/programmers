
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for (int i = 0; i < dic.length; i++) {

            Set<Character> set = new HashSet<>();

            for (int j = 0; j < dic[i].length(); j++) {

                set.add(dic[i].charAt(j));
            }

            boolean match = true;

            for (String s : spell) {

                if (!set.contains(s.charAt(0))) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return 1;
            }
        }


        return 2;
    }
}