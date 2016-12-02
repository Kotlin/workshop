package _1BreakingSafety;

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
