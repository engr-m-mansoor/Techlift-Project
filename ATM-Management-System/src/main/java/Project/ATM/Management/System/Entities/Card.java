package Project.ATM.Management.System.Entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id", nullable = false)
    private Long cardId;
    @Column(name = "card_type", nullable = false)
    private String cardType;

    /*public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }*/
}
