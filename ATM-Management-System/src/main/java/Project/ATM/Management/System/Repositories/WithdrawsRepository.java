package Project.ATM.Management.System.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WithdrawsRepository extends JpaRepository<Withdraws, Integer> {
}
