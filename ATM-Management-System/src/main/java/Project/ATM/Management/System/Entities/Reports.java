package Project.ATM.Management.System.Entities;

import javax.persistence.*;


@Entity
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Report ID", nullable = false)
    private Long reportId;
    private Long clientId;
    private Long cardId;
    private Long transactionId;
    private Long transactionTypeId;
    private Long totalAmount;
    private String date;



}
