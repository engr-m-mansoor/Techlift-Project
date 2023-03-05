package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class BalanceInquiries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "balance_id", nullable = false)
    private Long balanceId;
    @Column(name = "card_id", nullable = false)
    private Long cardId;
    @Column(name = "client_id", nullable = false)
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



