package llm.java.sample.hibernate.crud.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "userEntity")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 4865903039190150223L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="usr_id")
    private long id;

    @Column(name = "usr_name")
    private String name;

    @Column(name = "usr_first_name")
    private String firstName;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
