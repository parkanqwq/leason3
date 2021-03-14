package com.company;

import java.util.*;

public class Main {

    private static String[] arrStr = new String[400];

    public static void main(String[] args) {

        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = "arrStr " + (i+1);
        }

        System.out.println();
        System.out.println("---Задание 3.1---");
        long a = System.nanoTime();
        ArrayList<String> arrayStr = new ArrayList<>(Arrays.asList(arrStr));
        whatTime("Преобразование из массива в ArrayList ", a);
        long a1 = System.nanoTime();
        LinkedList<String> linkedStr = new LinkedList<>(Arrays.asList(arrStr));
        whatTime("Преобразование из массива в LinkedList ", a1);
        System.out.println();

        System.out.println("---Задание 3.2---");
        long b = System.nanoTime();
        arrayStr.add("Hello");
        arrayStr.get(350);
        arrayStr.remove("Hello");
        whatTime("Добавление, поиск и удаление из ArrayList ", b);
        long b1 = System.nanoTime();
        linkedStr.add("Hello");
        linkedStr.get(350);
        linkedStr.remove("Hello");
        whatTime("Добавление, поиск и удаление из LinkedList ", b1);
        System.out.println();

        System.out.println("---Задание 3.3---");
        MyList myList = new MyList();
        myList.addFront("Hi");
        myList.addBack("my");
        myList.addBack("Hu");
        myList.delEl("Hu");
        myList.printList();
        System.out.println();
        System.out.println();

        System.out.println("---Задание 3.4---");
        LinkedList<String> list34 = new LinkedList<>();
        list34.add("Hello me friend");
        System.out.println(list34.get(0));
        list34.addFirst("OOO");
        list34.clear();
        list34.addAll(arrayStr);
        System.out.println(list34.get(4));
        System.out.println();

        System.out.println("---Задание 3.5---");
        ListIterator<String> iterator = list34.listIterator();
        long c = System.nanoTime();

        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();

        iterator.set("Hello ");

        while(iterator.hasPrevious()){
            System.out.print(iterator.previous());
        }
        System.out.println();
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous());
            iterator.remove();
        }

        whatTime("Тут у нас работа итератора ", c);

    }

    private static void whatTime(String text, long time){
        System.out.println(text + (System.nanoTime() - time) + " Нано секунд");
    }
}
