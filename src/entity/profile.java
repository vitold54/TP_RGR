package entity;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profile")
public class profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Profile")
    private Set<seller> Seller;

    private String name;

    @Column(nullable = false, length = 30)
    private String surname;

    @Column(nullable = false, length = 30)
    private String avatar;
    
    
    private String Phone_number;
    
    private String passport;
    
    private String address;

    public profile() {
    }

    public profile(String name, String surname, String Phone_number,String passport,String address, String avatar, Set<seller> Seller) {
        this.name = name;
        this.surname = surname;
        this.Phone_number=Phone_number;
        this.passport=passport;
        this.passport=address;
        this.avatar=avatar;
        this.Seller=Seller;

    }

     public Set<seller> getseller() {
        return Seller;
    }

    public void setseller(Set<seller> Seller) {
        this.Seller = Seller;
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    
    
    public String getsurname() {
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }
    
    public String getpassport() {
        return passport;
    }

    public void setpassport(String passport) {
        this.passport = passport;
    }
    
    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }
    
    
    public String getavatar() {
        return avatar;
    }

    public void setavatar(String avatar) {
        this.avatar = avatar;
    }
    
    


    @Override
    public String toString() {
        return "Profile [Name: " + name +
                ", surname: " + surname +
                ", Address: " + address +
                "]";
    }
}