package kmu.book.Controllers;

import kmu.book.Models.Student;
import kmu.book.repos.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    StudentRepository studentRepository = new StudentRepository();

    @GetMapping(path = "/students")
    public List<Student> GetAllStudents() { return studentRepository.GetAllStudents();}

    @GetMapping(path = "/students/{id}")
    public Student GetStudent(@PathVariable int id){
        return studentRepository.GetStudent(id);
    } // 지정 책 읽어오기

    @PostMapping(path = "/students/add")
    public List<Student> addStudent(@RequestBody Student student){
        studentRepository.addStudent(student);
        return studentRepository.GetAllStudents();
    }

    @PostMapping(path = "/students/search/{term}")
    public List<Student> searchStudent(@PathVariable String term){
        return studentRepository.search(term);
    }

    @DeleteMapping(path = "/students/delete/{id}")
    public List<Student> deleteStudent(@PathVariable int id) {
        studentRepository.deleteStudent(id);
        return studentRepository.GetAllStudents();
    }

}
