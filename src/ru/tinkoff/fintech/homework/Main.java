package ru.tinkoff.fintech.homework;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        MyCollection<Integer> myCollection = new MyCollection<>();
        myCollection.add(1);
        myCollection.add(30);
        myCollection.add(20);
        myCollection.add(30);
        myCollection.add(40);



//        myCollection.add(30); // тут появится ошибка - вышли за пределы массива

        Iterator<Integer> it = myCollection.iterator();

//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        for (Integer i : myCollection) {
            System.out.println(i);
        }





    }

}
