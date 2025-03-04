package sam.example.smartacademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sam.example.smartacademy.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}