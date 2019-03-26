package org.jetbrains.kotlinworkshop.quizzes._3Classes;

public class UsePersonFromJava {
    public static void main(String[] args) {
        // constructor
        Person person = new Person("Alice", 27);

        // 2 getters
        System.out.println(person.getName());
        System.out.println(person.getAge());

        // 1 setter
        person.setAge(28);
    }
}
