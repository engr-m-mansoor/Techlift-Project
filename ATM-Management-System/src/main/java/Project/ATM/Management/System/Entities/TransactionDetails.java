package Project.ATM.Management.System.Entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class TransactionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id", nullable = false)
    private Long transactionId;
    @Column(name = "account_number", nullable = false)
    private Long accountNumber;
    @Column(name = "transaction_type_id", nullable = false)
    private Long transactionTypeId;


    @Column(name = "amount_processed", nullable = false)
    private Long AmountProcessed;
    @Column(name = "available_balance", nullable = false)
    private Long availableBalance;
    public Long getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Long availableBalance) {
        this.availableBalance = availableBalance;
    }



    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public Long getAmountProcessed() {
        return AmountProcessed;
    }

    public void setAmountProcessed(Long amountProcessed) {
        AmountProcessed = amountProcessed;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name = "date", nullable = false)
    private String date;

}
