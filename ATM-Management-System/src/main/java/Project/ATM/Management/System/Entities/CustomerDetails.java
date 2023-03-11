package Project.ATM.Management.System.Entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity

public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cnic", nullable = false)
    private Long clientCnic;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "gender", nullable = false)
    private char gender;
    @Column(name = "contact_details", nullable = false)
    private Long contactDetails;
    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "account_number", nullable = false)
    private Long accountNumber;

    public Long getClientCnic() {
        return clientCnic;
    }

    public void setClientCnic(Long clientCnic) {
        this.clientCnic = clientCnic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Long getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Long contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
