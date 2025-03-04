package sam.example.smartacademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sam.example.smartacademy.entity.Finance;

public interface FinanceRepository extends JpaRepository<Finance, Long> {
}