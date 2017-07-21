package org.jetbrains.kotlinworkshop.student.introduction._2Shop;

import java.util.*;

public class JavaCode {
    public Collection<String> doSomethingStrangeWithCollection(Collection<String> collection) {
        Map<Integer, List<String>> groupsByLength = new HashMap<Integer, List<String>>();
        for (String s : collection) {
            List<String> strings = groupsByLength.get(s.length());
            if (strings == null) {
                strings = new ArrayList<String>();
                groupsByLength.put(s.length(), strings);
            }
            strings.add(s);
        }

        int maximumSizeOfGroup = 0;
        for (List<String> group : groupsByLength.values()) {
            if (group.size() > maximumSizeOfGroup) {
                maximumSizeOfGroup = group.size();
            }
        }

        for (List<String> group : groupsByLength.values()) {
            if (group.size() == maximumSizeOfGroup) {
                return group;
            }
        }
        return null;
    }
}
