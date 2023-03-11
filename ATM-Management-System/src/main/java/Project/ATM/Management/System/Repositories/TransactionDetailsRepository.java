package Project.ATM.Management.System.Repositories;
import Project.ATM.Management.System.Entities.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDetailsRepository extends JpaRepository< TransactionDetails, Integer> {
}
