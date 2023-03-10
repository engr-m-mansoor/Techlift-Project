package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<CustomerDetails, Integer> {
}
