package database;

import java.io.*;
import java.util.*;

public class SimpleDatabase {
    private static final String FILE_NAME = "database/data.csv";
    private static final String DELIMITER = ",";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ensureFileExists();

        while (true) {
            System.out.println("\n--- Simple Java Database (Excel Compatible CSV) ---");
            System.out.println("1. Add Record (Name, Age, Email)");
            System.out.println("2. View All Records");
            System.out.println("3. Search by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.hasNextInt() ? scanner.nextInt() : 4;
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addRecord(scanner);
                    break;
                case 2:
                    viewAllRecords();
                    break;
                case 3:
                    searchRecord(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void ensureFileExists() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                File directory = new File("database");
                if (!directory.exists()) {
                    directory.mkdir();
                }
                FileWriter writer = new FileWriter(FILE_NAME);
                writer.write("Name,Age,Email\n"); // Header
                writer.close();
                System.out.println("Database file created: " + FILE_NAME);
            } catch (IOException e) {
                System.out.println("Error creating database file: " + e.getMessage());
            }
        }
    }

    private static void addRecord(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        String age = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(name + DELIMITER + age + DELIMITER + email);
            System.out.println("Record added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to database: " + e.getMessage());
        }
    }

    private static void viewAllRecords() {
        System.out.println("\n--- Records ---");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                System.out.printf("%-15s %-5s %-20s\n", values[0], values.length > 1 ? values[1] : "", values.length > 2 ? values[2] : "");
            }
        } catch (IOException e) {
            System.out.println("Error reading database: " + e.getMessage());
        }
    }

    private static void searchRecord(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                if (values[0].toLowerCase().contains(searchName)) {
                    System.out.println("Found: " + line);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No records found matching: " + searchName);
            }
        } catch (IOException e) {
            System.out.println("Error searching database: " + e.getMessage());
        }
    }
}
