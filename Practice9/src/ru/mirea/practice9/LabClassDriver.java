package ru.mirea.practice9;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class LabClassDriver {

    LabClass labClass;
    String FILE = "src/ru/mirea/practice9/students.txt";

    LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void createLabClass() {
        out.println("Введите имя и оценку студента для добавления ('exit' для выхода): ");
        String name;
        int GPA;
        Scanner in = new Scanner(System.in);
        do {
            name = (in.next()).toLowerCase();
            if (!name.equals("exit")) {
                GPA = in.nextInt();
                labClass.add(new Student(name, GPA));
            }
        } while (!name.equals("exit"));
    }

    public void saveLabCLass() {

        try {
            FileWriter writer = new FileWriter(FILE);

            while (!labClass.isEmpty()) {
                writer.write(labClass.remove().toString() + "\n");
            }
            writer.flush();
        }
        catch (Exception e) {
            err.println("Такого файла нет!");
        }

    }

    public void fillLabClass() {
        try {
            FileReader reader = new FileReader(FILE);
            Scanner in = new Scanner(reader);
            while (in.hasNextLine()) {
                String string = in.nextLine();
                String[] arr=string.split(" ");

                labClass.add(new Student(arr[1], Integer.parseInt(arr[2])));
            }
        }
        catch (FileNotFoundException e) {
            err.println("Такого файла нет!");
        }
    }
}