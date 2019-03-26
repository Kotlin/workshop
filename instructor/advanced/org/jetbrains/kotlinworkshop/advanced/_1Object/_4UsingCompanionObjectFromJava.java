package org.jetbrains.kotlinworkshop.advanced._1Object;

public class _4UsingCompanionObjectFromJava {

    public static void main(String[] args) {

        A.Companion.create();
//        A.create() //- doesn't compile

        A.Companion.staticFunction();
        A.staticFunction();
    }
}
