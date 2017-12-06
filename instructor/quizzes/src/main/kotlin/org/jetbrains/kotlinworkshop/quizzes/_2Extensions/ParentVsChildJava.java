package org.jetbrains.kotlinworkshop.quizzes._2Extensions;

public class ParentVsChildJava {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(foo(parent));
        System.out.println(ParentVsChildKt.foo(parent));
    }

    private static String foo(Parent parent) {
       return "parent";
    }

    private static String foo(Child child) {
       return "child";
    }
}
