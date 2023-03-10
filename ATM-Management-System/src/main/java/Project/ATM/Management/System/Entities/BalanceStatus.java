package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class BalanceStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "balance_status_id", nullable = false)
    private Long balanceStatusId;
    @Column(name = "balance", nullable = false)
    private Long balance;

    @Column(name = "date", nullable = false)
    private String date;
    @Column(name = "account_number", nullable = false)
    private Long accountNumber;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Column(name = "time", nullable = false)
    private String time;

    public Long getBalanceStatusId() {
        return balanceStatusId;
    }

    public void setBalanceStatusId(Long balanceStatusId) {
        this.balanceStatusId = balanceStatusId;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }



}