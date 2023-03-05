package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypesRepository extends JpaRepository<TransactionType, Integer> {
}
