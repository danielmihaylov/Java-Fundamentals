package JavaOOPBasic.Inheritance.manKind.manKind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] student = reader.readLine().split("\\s+");
        String firstName = student[0];
        String lastName = student[1];
        String facultyNumber = student[2];

        String[] worker = reader.readLine().split("\\s+");
        String firstNameWorker = worker[0];
        String lastNameWorker = worker[1];
        double salary = Double.parseDouble(worker[2]);
        double workingHours = Double.parseDouble(worker[3]);

        try {
            Human student1 = new Student(firstName, lastName, facultyNumber);
            Human worker1 = new Worker(firstNameWorker, lastNameWorker, salary, workingHours);
            System.out.println(student1.toString());
            System.out.println(worker1.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }
    }

}
