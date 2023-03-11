package Project.ATM.Management.System.Entities;


import jakarta.persistence.*;

@Entity
public class TransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_type_id")
    private Long transactionTypeId;
    @Column(name = "transaction_type_name")
    private String transactionTypeName;

    @OneToOne
    private Transaction transactionType;

}
