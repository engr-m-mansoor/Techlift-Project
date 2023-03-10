package Project.ATM.Management.System.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
public class AccountDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_number", nullable = false)
    private Long accountNumber;

    @Column(name = "card_number", nullable = false)
    private Long cardNumber;

    @Column(name = "card_pin", nullable = false)
    private Long cardPin;


    @Column(name = "card_type_id", nullable = false)
    private Long cardTypeId;

    public Long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @Column(name = "account_type_id", nullable = false)
    private Long accountTypeId;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getCardPin() {
        return cardPin;
    }

    public void setCardPin(Long cardPin) {
        this.cardPin = cardPin;
    }

    public Long getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(Long cardTypeId) {
        this.cardTypeId = cardTypeId;
    }
}
