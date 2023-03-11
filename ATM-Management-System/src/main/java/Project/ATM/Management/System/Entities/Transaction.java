package Project.ATM.Management.System.Entities;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;
    @Column(name = "amount_processed")
    private Long AmountProcessed;
    @Column(name = "date")
    private String date;

    @OneToOne
    @JoinColumn(name = "transaction_type_id")
    private TransactionType transactionTypeInformation;


    @ManyToOne
    @JoinColumn(name = "account_number")
    private  Account account_transaction;


}
