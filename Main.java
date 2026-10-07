package com.expense;

import com.expense.model.Expense;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     PERSONAL EXPENSE TRACKER");
        System.out.println("================================");

        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        Expense expense = new Expense(1, amount, category, description, LocalDate.now());

        System.out.println("\nExpense added successfully!");
        System.out.println("----------------------------");
        System.out.println(expense);

        scanner.close();
    }
}
