package _2Object;

public class UsingCompanionObjectFromJava {

    public static void main(String[] args) {

        A.Companion.create();
//        A.create() //- doesn't compile

        A.Companion.staticFunction();
        A.staticFunction();
    }
}
