package Project.ATM.Management.System.Entities;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class AccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_type_id")
    private Long accountTypeId;
    @Column(name = "account_type_description")
    private String accountTypeDescription;
    @Column(name = "max_allowed_withdrawal")
    private Long maxAllowedWithdrawal;
    @OneToOne
    private Account account;
}
