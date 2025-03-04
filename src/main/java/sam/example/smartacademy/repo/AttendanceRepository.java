package sam.example.smartacademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sam.example.smartacademy.entity.Attendance;
import sam.example.smartacademy.entity.Student;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findAllBYStudentIn(List<Student> students);

}