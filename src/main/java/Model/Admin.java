package Model;

import javax.persistence.*;

@Entity
public class Admin {
    @Column(name = "Admin_id")
    private Long authorizationCode;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(Long authorizationCode) {
        this.authorizationCode = authorizationCode;
    }
}
