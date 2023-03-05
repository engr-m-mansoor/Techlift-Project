package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.Savings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsRepository extends JpaRepository<Savings, Integer> {
}
