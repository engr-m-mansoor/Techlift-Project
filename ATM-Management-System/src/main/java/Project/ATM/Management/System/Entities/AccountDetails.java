package Project.ATM.Management.System.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class AccountDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_number")
    private Long accountNumber;
    @Column(name = "card_number")
    private Long cardNumber;
    @Column(name = "card_pin")
    private Long cardPin;

    @OneToOne
    private CustomerDetails customerDetails;

    @OneToOne(mappedBy = "accountDetailsType")
    @JoinColumn(name = "account_type_id")
    private List<AccountTypes> accountTypesList;

    @OneToOne(mappedBy = "accountDetailsCard")
    @JoinColumn(name = "card_type_id")
    private List<CardTypes> cardTypesList;

    @OneToMany (mappedBy = "transactionDetails")

    private List<TransactionDetails> transactionDetailsList;

}
