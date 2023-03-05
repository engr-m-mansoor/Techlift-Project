package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class Withdraws {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Withdraw ID", nullable = false)
    private Long withdrawId;
    @Column(name = "client_id", nullable = false)
    private Long clientId;
    @Column(name = "card_id", nullable = false)
    private Long cardId;
    @Column(name = "amount", nullable = false)
    private Long amount;

    public Long getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(Long withdrawId) {
        this.withdrawId = withdrawId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }




}
