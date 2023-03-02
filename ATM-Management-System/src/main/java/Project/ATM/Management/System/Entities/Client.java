package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false)
    private Long clientId;

    String fullName;
    String lastName;


    public Long getPk_id() {
        return id;
    }

    public void setPk_id(Long pk_id) {
        this.pk_id = pk_id;
    }
}
