package algorithms.string.easy;

import java.util.HashSet;
import java.util.Set;

public class uniqEmail {
    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        for (String s: emails)
            set.add(isEmail(s));
        return set.size();

    }
    public String  isEmail(String s){
        String[] part = s.split("@");
        String part1 = part[0];
        String part2 = part[1];

        if(part1.contains("+")){
            int plus = part1.indexOf('+');
            part1 = part1.substring(0,plus);
        }
        part1 =part1.contains(".") ? part1.replaceAll("[.]",""):part1;
        return part1+"@"+part2;
    }
}
