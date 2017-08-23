package StreamAPI.Students;

import javafx.animation.PathTransition;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Path studentsDataPath = Paths.get("C:\\Users\\Daniel\\Desktop\\StudentData\\StudentData.txt");
        List<String> data = new ArrayList<>();

        try {
            data = Files.readAllLines(studentsDataPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <data.size() ; i++) {
            String[] tokens = data.get(i).split("\\s+");
            String facNum = tokens[0];
            String firstName = tokens[1];
            String lastName = tokens[2];
            String email = tokens[3];
            Integer age = Integer.valueOf(tokens[4]);
            Integer group = Integer.valueOf(tokens[5]);
            String phone = tokens[10];

            Student student = new Student(facNum,firstName,lastName,email,age,group,phone);

            for (int gradeIndex = 6; gradeIndex <= 9 ; gradeIndex++) {
                Integer grade = Integer.valueOf(tokens[gradeIndex]);
                student.getGrades().add(grade);
            }
            students.add(student);
        }
        students
                .stream()
                .filter(pesho -> pesho.getGrades()
                        .stream()
                        .filter(g-> g <=3)
                        .count() >= 2).sorted((s1,s2)-> Integer.compare(s1.getGrades()
                .stream()
                .mapToInt(e-> e).sum(), s2.getGrades()
                .stream().mapToInt(e-> e).sum()))
                .forEach(gosho -> {
                    System.out.printf("%s %s ",gosho.getFirstName(),gosho.getLastName());
                    System.out.printf("%s %n",gosho.getGrades().stream().sorted().map(String::valueOf).collect(Collectors.joining(" ")));
        });
    }
}
