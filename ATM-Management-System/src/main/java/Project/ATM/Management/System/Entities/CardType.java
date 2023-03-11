package Project.ATM.Management.System.Entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class CardType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_type_id")
    private Long cardTypeId;
    @Column(name = "card_type_description")
    private String cardTypeDescription;

    @OneToOne
    private Account account;
}
