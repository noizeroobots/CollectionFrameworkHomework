package ru.tinkoff.fintech.homework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class MyCollection<E> implements Collection<E>,Iterable<E> {

    private int size;
    private Object[] elementData = new Object[3];

//    public MyCollection(Object[] elementData) {
//        this.elementData = elementData;
//        size = elementData.length;
//    }
// Ща соберем коллекцию с нуля

    @Override
    public boolean add(E e) {
        if (size == elementData.length) {
            elementData = Arrays.copyOf(elementData, (int)(size * 1.5f));
            System.out.println("new capacity: " + elementData.length);
        }
        elementData[size++] = e;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    private class MyIterator<T> implements Iterator<T>{

        private int cursor;


        @Override
        public void remove() {

        }

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            return (T) elementData[cursor++];
        }
    }
}
