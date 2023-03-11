package Project.ATM.Management.System.Repositories;



import Project.ATM.Management.System.Entities.AccountType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {
}
