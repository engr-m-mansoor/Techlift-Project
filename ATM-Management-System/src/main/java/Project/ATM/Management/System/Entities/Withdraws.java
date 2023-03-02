package Project.ATM.Management.System.Entities;

import javax.persistence.*;

@Entity
public class Withdraws {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id", nullable = false)
    private Long pk_id;

    public Long getPk_id() {
        return pk_id;
    }

    public void setPk_id(Long pk_id) {
        this.pk_id = pk_id;
    }
}
