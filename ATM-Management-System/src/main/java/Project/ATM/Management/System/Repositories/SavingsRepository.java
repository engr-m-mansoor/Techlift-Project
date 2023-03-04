package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.Savings;
import Project.ATM.Management.System.Entities.Withdraws;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsRepository extends JpaRepository<Savings, Integer> {
}
