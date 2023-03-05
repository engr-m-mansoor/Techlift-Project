package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.TransactionRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRecordsRepository extends JpaRepository<TransactionRecords, Integer> {
}
