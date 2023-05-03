package Homework7.Work2;

import java.util.*;

public class MyClass {
    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Створюємо Set об'єкт
        Set<MyClass> mySet = new HashSet<>();

        // Наповнюємо Set об'єктами класу MyClass
        mySet.add(new MyClass("Іван", 25));
        mySet.add(new MyClass("Марія", 20));
        mySet.add(new MyClass("Петро", 30));

        // Виводимо невідсортований список
        System.out.println("Невідсортований список:");
        for (MyClass obj : mySet) {
            System.out.println(obj.getName() + ", " + obj.getAge());
        }

        // Сортуємо за іменем (використовуючи Comparator)
        List<MyClass> sortedList = new ArrayList<>(mySet);
        Collections.sort(sortedList, new Comparator<MyClass>() {
            @Override
            public int compare(MyClass obj1, MyClass obj2) {
                return obj1.getName().compareTo(obj2.getName());
            }
        });

        // Виводимо відсортований список за іменем
        System.out.println("Список, відсортований за іменем:");
        for (MyClass obj : sortedList) {
            System.out.println(obj.getName() + ", " + obj.getAge());
        }

        // Сортуємо за віком (використовуючи Comparator)
        Collections.sort(sortedList, new Comparator<MyClass>() {
            @Override
            public int compare(MyClass obj1, MyClass obj2) {
                return obj1.getAge() - obj2.getAge();
            }
        });

        // Виводимо відсортований список за віком
        System.out.println("Список, відсортований за віком:");
        for (MyClass obj : sortedList) {
            System.out.println(obj.getName() + ", " + obj.getAge());
        }
    }
}
