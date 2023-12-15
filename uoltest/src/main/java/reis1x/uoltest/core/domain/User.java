package reis1x.uoltest.core.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "users")
@Table (name= "users")
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "cl_name")
    private String name;
    @Column(name = "cl_email")
    private String email;
    @Column(name = "cl_telephone")
    private String tel;
    @Column(name = "cl_codename")
    private String codename;
    @Column(name = "cl_group")
    private String group;
}