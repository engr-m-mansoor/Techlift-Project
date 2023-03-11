package Project.ATM.Management.System.Repositories;

import Project.ATM.Management.System.Entities.CardTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardTypesRepository extends JpaRepository<CardTypes, Integer> {
}
