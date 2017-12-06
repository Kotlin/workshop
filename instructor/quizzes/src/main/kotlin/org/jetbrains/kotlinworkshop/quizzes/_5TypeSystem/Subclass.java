package org.jetbrains.kotlinworkshop.quizzes._5TypeSystem;

public class Subclass extends Parent {
    private String foo;

    public Subclass(String foo) {
        this.foo = foo;
    }

    @Override
    String getFoo() {
        return foo;
    }
}
