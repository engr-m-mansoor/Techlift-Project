package Project.ATM.Management.System.Entities;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Data
@Entity

public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="serial_no")
    private Long Serial_No;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cnic")
    private Long Cnic;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private char gender;
    @Column(name = "contact_number")
    private Long contactNumber;
    @Column(name = "address")
    private String address;

    @OneToOne
    @JoinColumn(name = "account_number")
    private Account accountData;

}
