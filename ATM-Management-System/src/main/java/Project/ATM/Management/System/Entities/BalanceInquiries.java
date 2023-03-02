package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class BalanceInquiries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Balance ID", nullable = false)
    private Long balanceId;
    private Long cardId;
    private Long clientId;

    public Long getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(Long balanceId) {
        this.balanceId = balanceId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

}



