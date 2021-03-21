package ru.tinkoff.fintech.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollectionMethods {


    public static <E> void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(10);
        collection.add(11);
        collection.add(12);
        collection.add(13);
        collection.add(10);
//        System.out.println(collection.retainAll(Arrays.asList(2, 10)));
//        System.out.println(collection.toString());

        Collection<Integer> myCollection = new MyCollection<>();
        myCollection.add(1996);
        myCollection.add(1997);
        myCollection.add(1998);
        myCollection.add(1998);
        myCollection.add(1999);
        myCollection.add(2000);

        System.out.println("beforee: " + myCollection.size());

        System.out.println(myCollection.toString());


        myCollection.addAll(Arrays.asList(555, 666));

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            iterator.remove();
        }

        System.out.println("afterr: " + myCollection.size());
        System.out.println(myCollection.toString());

//        System.out.println("\nmyCollection: " + myCollection);
//        System.out.println("\ncollection: " + collection);
//        Object result = null;
//
//        collection.addAll(myCollection);
//        System.out.println("after addAll: " + collection + ". Его размер:  " + collection.size());
//
//        Object [] arr = collection.toArray();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        Iterator<Integer> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            Integer tmp = iterator.next();
//            System.out.println(tmp);
//        }
//
//
//
//
//
//
//
//        if (result instanceof Object[]) {
//            Object[] arrObj = (Object[]) result;
//            for (Object o : arrObj) {
////                System.out.print(o + "");
//            }
//            System.out.println("");
    }
//        System.out.println("after: " + collection);
}

//[1, 2, null, 99, 2]
//        Integer[] arr = new Integer[5]; // Если мы хотим вернуть массив Интеджеров, вместо Обджектов
//        Integer[] arr = new Integer[10]; // Если мы хотим вернуть массив Интеджеров, вместо Обджектов
//        Integer[] arr = new Integer[3]; // Если мы хотим вернуть массив Интеджеров, вместо Обджектов

//        result = collection.retainAll(Arrays.asList(2)); // Оставляет только те элементы, которые мы передали
//        result = collection.size();
//        result = collection.isEmpty(); // Пуста наша коллекция или нет?
//        result = collection.add(5); // Добавить один элемент
//        result = collection.addAll(Arrays.asList(10, 4, 5, 6)); // Добавить несколько элементов
//        result = collection.remove(2); // Удалить элемент из коллекции
//        result = collection.removeAll(Arrays.asList(2, null)); // Удалить все элементы из коллекции
//        collection.clear(); // Ничего не возвращает
//        result = collection.contains(99); // Проверяет, есть ли элемент в нашей коллекции
//        result = collection.containsAll(Arrays.asList(1,2,33)); // Проверяет, есть ли элемент в нашей коллекции, поданные на вход
//        result = collection.toArray(arr); // Превращает нашу коллекцию в массив
//        result = collection.toArray();

//        result = collection.remove();


