package sam.example.smartacademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sam.example.smartacademy.entity.GroupAttendance;

public interface GroupAttendanceRepository extends JpaRepository<GroupAttendance, Long> {
}