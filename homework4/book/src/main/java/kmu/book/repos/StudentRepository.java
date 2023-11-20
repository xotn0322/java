package kmu.book.repos;

import kmu.book.Models.Book;
import kmu.book.Models.Student;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    static List<Student> students = new ArrayList<>();

    public StudentRepository() {LoadStudent();}

    static void LoadStudent() {
        students.add(new Student(1, "Jin", "a"));
        students.add(new Student(2, "Kim", "b"));
        students.add(new Student(3, "Li", "c"));
    }

    public List<Student> GetAllStudents() {
        if (students.isEmpty()) {
            LoadStudent();
        }

        return students;
    }
    public Student GetStudent(@PathVariable int id) {
        return students.get(id-1);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> search(String name) {
        List<Student> students1 = students.stream().filter(student -> student.getName().contains(name)).toList();
        return students1;
    }

    public void deleteStudent(@PathVariable int id) {
        students.remove(id-1);
    }
}
