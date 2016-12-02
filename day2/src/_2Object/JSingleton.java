package _2Object;

public class JSingleton {
    public final static JSingleton INSTANCE = new JSingleton();

    private JSingleton() {
    }

    public void foo() {}
}
