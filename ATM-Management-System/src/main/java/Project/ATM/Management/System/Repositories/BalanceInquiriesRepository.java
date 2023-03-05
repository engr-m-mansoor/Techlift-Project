package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.BalanceInquiries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceInquiriesRepository extends JpaRepository<BalanceInquiries, Integer> {
}
