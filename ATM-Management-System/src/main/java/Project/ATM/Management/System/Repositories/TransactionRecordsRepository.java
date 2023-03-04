package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.Withdraws;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRecordsRepository extends JpaRepository<TransactionRecordsRepository, Integer> {
}
