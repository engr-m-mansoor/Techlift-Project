package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class TransactionTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Transaction Type ID", nullable = false)
    private Long transactionTypeId;
    private String transactionTypeName;

    public Long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }
}
