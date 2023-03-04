package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.Client;
import Project.ATM.Management.System.Entities.Withdraws;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
