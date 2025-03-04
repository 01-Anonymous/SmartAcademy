package sam.example.smartacademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sam.example.smartacademy.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
}