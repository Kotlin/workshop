package org.jetbrains.kotlinworkshop.student.single._1BreakingSafety;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class JavaClass {
    public String getValue() {
        return null;
    }

    public static void dangerousJavaMethod(List<Integer> list) {
        list.add(null);
    }
}
