package ru.tinkoff.fintech.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyCollectionMethods {


    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(null);
        collection.add(99);
        collection.add(2);
        collection.add(2);

        System.out.println("\nbefore: " + collection);
        Object result = null;


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


        System.out.println("result: " + result);

        if (result instanceof Object[]){
            Object[] arrObj = (Object[]) result;
            for (Object o : arrObj){
                System.out.print(o + " ");
            }
            System.out.println("");
        }
        System.out.println("after: " + collection);
    }
}
