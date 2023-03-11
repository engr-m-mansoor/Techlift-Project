package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class CardType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_type-id", nullable = false)
    private Long cardTypeId;
    @Column(name = "card_type-description", nullable = false)
    private String cardTypeDescription;

    public Long getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(Long cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getCardTypeDescription() {
        return cardTypeDescription;
    }

    public void setCardTypeDescription(String cardTypeDescription) {
        this.cardTypeDescription = cardTypeDescription;
    }

}
