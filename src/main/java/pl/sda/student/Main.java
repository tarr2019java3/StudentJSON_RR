package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student student = new Student("Jan", "Kowalski", 32);
        Student student1 = new Student("Rysiek", "Nowak", 54);
        Student student2 = new Student("Waldek", "Kwas", 44);
        Student student3 = new Student("Witek", "Morski", 19);
        Student student4 = new Student("Olek", "Azor", 28);
        Student student5 = new Student("Marek", "Kowal", 24);

        ObjectMapper objectMapper = new ObjectMapper();
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        try {
            objectMapper.writeValue(new File("student.json"), studentList);

        } catch (IOException e) {
            e.printStackTrace();
        }

       JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeList("list.json", studentList);
        jsonUtils.readList("list.json");
    }
}
