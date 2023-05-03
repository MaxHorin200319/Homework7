package Homework7.Work1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Purchase {
    private String name;
    private int quantity;

    public Purchase(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Purchase> purchases = new ArrayList<Purchase>();

        // Введення списку покупок користувачем
        while (true) {
            System.out.print("Введіть назву товару (або 'stop' для завершення вводу): ");
            String name = scanner.nextLine();
            if (name.equals("stop")) {
                break;
            }
            System.out.print("Введіть кількість товару: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            purchases.add(new Purchase(name, quantity));
        }

        // Сортування списку покупок в алфавітному порядку
        Collections.sort(purchases, new Comparator<Purchase>() {
            @Override
            public int compare(Purchase p1, Purchase p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        // Виведення списку покупок в алфавітному порядку
        System.out.println("Список покупок в алфавітному порядку:");
        for (Purchase purchase : purchases) {
            System.out.println(purchase.getName() + ": " + purchase.getQuantity());
        }
    }
}
