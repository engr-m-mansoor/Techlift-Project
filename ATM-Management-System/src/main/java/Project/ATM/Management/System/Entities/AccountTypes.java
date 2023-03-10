package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class AccountTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_type_id", nullable = false)
    private Long accountTypeId;

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

    @Column(name = "account_type_description", nullable = false)
    private String accountTypeDescription;

}
