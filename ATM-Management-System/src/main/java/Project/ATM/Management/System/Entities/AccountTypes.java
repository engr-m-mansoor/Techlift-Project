package Project.ATM.Management.System.Entities;
import javax.persistence.*;

@Entity
public class AccountTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountTypeId;

    private String accountTypeDescription;
    private Long maxAllowedWithdrawal;

    public Long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeDescription() {
        return accountTypeDescription;
    }

    public void setAccountTypeDescription(String accountTypeDescription) {
        this.accountTypeDescription = accountTypeDescription;
    }

    public Long getMaxAllowedWithdrawal() {
        return maxAllowedWithdrawal;
    }

    public void setMaxAllowedWithdrawal(Long maxAllowedWithdrawal) {
        this.maxAllowedWithdrawal = maxAllowedWithdrawal;
    }


}
