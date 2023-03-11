package Project.ATM.Management.System.Entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class CardTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_type_id")
    private Long cardTypeId;
    @Column(name = "card_type_description")
    private String cardTypeDescription;

    @OneToOne
    private AccountDetails accountDetailsCard;
}
