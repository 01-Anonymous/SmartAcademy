package sam.example.smartacademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sam.example.smartacademy.entity.Groups;

public interface GroupsRepository extends JpaRepository<Groups, Long> {
}