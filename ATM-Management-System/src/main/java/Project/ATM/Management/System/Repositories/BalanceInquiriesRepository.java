package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.BalanceInquiries;
import Project.ATM.Management.System.Entities.Withdraws;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceInquiriesRepository extends JpaRepository<BalanceInquiries, Integer> {
}
