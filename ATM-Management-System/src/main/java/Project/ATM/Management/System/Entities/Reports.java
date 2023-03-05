package Project.ATM.Management.System.Entities;

import javax.persistence.*;


@Entity
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id", nullable = false)
    private Long reportId;
    @Column(name = "client_id", nullable = false)
    private Long clientId;
    @Column(name = "card_id", nullable = false)
    private Long cardId;
    @Column(name = "transaction_id", nullable = false)
    private Long transactionId;
    @Column(name = "transaction_type_id", nullable = false)
    private Long transactionTypeId;
    @Column(name = "total_amount", nullable = false)
    private Long totalAmount;
    @Column(name = "date", nullable = false)
    private String date;



}
