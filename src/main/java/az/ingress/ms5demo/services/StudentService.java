package az.ingress.ms5demo.services;

import az.ingress.ms5demo.model.Student;
import az.ingress.ms5demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student with id" + id + "not found"));
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student update(Long id, Student student) {
        getStudent(id);
        student.setId(id);
        return studentRepository.save(student);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
