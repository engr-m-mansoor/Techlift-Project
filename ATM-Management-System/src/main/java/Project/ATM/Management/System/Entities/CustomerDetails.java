package Project.ATM.Management.System.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity

public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cnic")
    private Long clientCnic;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private char gender;
    @Column(name = "contact_details")
    private Long contactDetails;
    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy = "customerDetails")
    @JoinColumn(name = "account_number")
    private List<AccountDetails> accountDetailslist;

}
