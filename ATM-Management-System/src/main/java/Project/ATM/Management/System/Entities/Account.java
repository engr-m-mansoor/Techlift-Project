package Project.ATM.Management.System.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="Account")
public class Account {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="serial_no")
    private Long Serial_No;
    @Id
    @Column(name = "account_number")
    private Long accountNumber;
    @Column(name = "card_number")
    private Long cardNumber;
    @Column(name = "card_pin")
    private Long cardPin;

    @OneToOne
    private Customer customerDetails;

    @OneToOne
    @JoinColumn(name = "account_type_id")
    private AccountType accountTypeInformation;

    @OneToOne
    @JoinColumn(name = "card_type_id")
    private CardType cardTypeInformation;

    @OneToMany
    private Transaction transaction;

}
