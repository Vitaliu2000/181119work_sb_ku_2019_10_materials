package ru.sbrf.ku.java.generics.bounds;

import ru.sbrf.ku.java.generics.bounds.entries.Cat;
import ru.sbrf.ku.java.generics.bounds.entries.HomeCat;

public class GenericsBounded<T extends Cat> {

    public static void main( String[] args ) {

        //GenericsBounded<Animal> genericsBounded = new GenericsBounded<>(); //ошибка
        GenericsBounded<Cat> ok1 = new GenericsBounded<>();
        GenericsBounded<HomeCat> ok2 = new GenericsBounded<>();

    }

}
