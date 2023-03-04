package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.Card;
import Project.ATM.Management.System.Entities.Withdraws;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
}
