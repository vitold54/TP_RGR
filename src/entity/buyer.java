package entity;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "buyer")
public class buyer {
    @Id
@Column(name = "id", nullable=false)
    private long id;

    @Column(nullable = false, length = 30)
    private String login;

    private String password;

    @Column(nullable = false, length = 30)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private profile Profile;
    
     
    public buyer() {
    }

    public buyer(String login, String password, String email, profile Profile) {
        this.login = login;
        this.password = password;
        this.email=email;
        this.Profile=Profile;
    }

    
    
    public profile getprofile() {
        return Profile;
    }

    public void setprofile(profile Profile) {
        this.Profile = Profile;
    }
 
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getlogin() {
        return login;
    }

    public void setlogin(String login) {
        this.login = login;
    }
    
    
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "[Email: " + email + "]";    }
}