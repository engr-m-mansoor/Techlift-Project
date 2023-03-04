package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.Reports;
import Project.ATM.Management.System.Entities.Withdraws;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepository extends JpaRepository<Reports, Integer> {
}
