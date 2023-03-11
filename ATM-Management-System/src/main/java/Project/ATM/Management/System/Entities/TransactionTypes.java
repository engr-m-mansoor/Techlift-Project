package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class TransactionTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_type_id")
    private Long transactionTypeId;
    @Column(name = "transaction_type_name")
    private String transactionTypeName;

    @OneToOne
    private TransactionDetails transactionDetails;

}
