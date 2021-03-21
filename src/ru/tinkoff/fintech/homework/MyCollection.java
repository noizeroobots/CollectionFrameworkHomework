package ru.tinkoff.fintech.homework;

import java.util.*;


public class MyCollection<E> implements Collection<E>, Iterable<E> {

    private int size;
    private Object[] elementData = new Object[3];

//    public MyCollection(Object[] elementData) {
//        this.elementData = elementData;
//        size = elementData.length;


    @Override
    public String toString() {
        return "MyCollection{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }

    @Override
    public boolean add(E e) {
        if (size == elementData.length) {
            elementData = Arrays.copyOf(elementData, (int) (size * 1.5f));
            System.out.println("new capacity: " + elementData.length);
        }
        elementData[size++] = e;
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(final Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                if (i != this.size - 1) {
                    System.arraycopy(elementData, i + 1, elementData, i, size - i);
                } else {
                    elementData[i] = null;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        for (final Object removeItem : c) {
            for (final Object item : this) {
                if (item.equals(removeItem)) {
                    remove(item);
                    break;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Boolean contains = false;
        for (final Object containItem : c) {
            contains = false;
            for (final Object item : this) {
                if (item.equals(containItem)) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                return contains;
            }
        }
        return contains;
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        for (final Object arr : this) {
            if (!c.contains(arr))
                this.remove(arr);
        }
        return true;
    }

    @Override
    public void clear() {
        elementData = (Object[]) new Object[1];
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (final E item : c) {
            add(item);
        }
        return true;
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    private class MyIterator<T> implements Iterator<T> {

        private int cursor = 0;
        private T lastRet = null;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        @SuppressWarnings("unchecked")
        public T next() {
            if (cursor >= size) {
                throw new NoSuchElementException();
            }
            lastRet = (T) elementData[cursor++];
            return lastRet;
        }

        @Override
        public void remove() {
            if (lastRet == null)
                throw new IllegalStateException();

            try {
                MyCollection.this.remove(lastRet);
                cursor--;
                lastRet = null;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

    }
}
