package az.ingress.ms5demo.repository;

import az.ingress.ms5demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
