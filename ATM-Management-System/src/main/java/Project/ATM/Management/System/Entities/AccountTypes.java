package Project.ATM.Management.System.Entities;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class AccountTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_type_id")
    private Long accountTypeId;
    @Column(name = "account_type_description")
    private String accountTypeDescription;
    @Column(name = "max_allowed_withdrawal")
    private Long maxAllowedWithdrawal;
    @OneToOne
    private AccountDetails accountDetailsType;
}
