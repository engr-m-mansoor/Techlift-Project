package Project.ATM.Management.System.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class TransactionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;
    @Column(name = "amount_processed")
    private Long AmountProcessed;
    @Column(name = "available_balance")
    private Long availableBalance;
    @Column(name = "date")
    private String date;

    @OneToOne(mappedBy = "transactionDetails")
    @JoinColumn(name = "transaction_type_id")
    private List<TransactionTypes> transactionTypesList;


    @ManyToOne
    @JoinColumn(name = "account_number")
    private  TransactionDetails transactionDetails;


}
