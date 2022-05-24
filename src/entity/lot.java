package entity;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "lot")
    public class lot {
    @Id
    @Column(name = "id", nullable=false)
    private long id;

    @Column(name = "profile_id", nullable=false)
    private long profile_id;
    
    @Column(name = "car_brand", length = 30)
    private String car_brand;

    @Column(name = "country", length = 30)
    private String country;
    
    private int years_car;
    
    @Column(name = "type_engine", length = 30)
    private String type_engine;
    
    @Column(name = "type_of_gearbox", length = 30)
    private String type_of_gearbox;
    
    private int engine_volume;
    
    private int mileage;


    public lot() {
    }

    public lot(long profile_id, String car_brand, String country, int years_car, String type_engine, String type_of_gearbox, int engine_volume, int mileage ) {
        this.profile_id = profile_id;
        this.car_brand = car_brand;
        this.country=country;
        this.years_car=years_car;
        this.type_engine=type_engine;
        this.type_of_gearbox=type_of_gearbox;
        this.engine_volume=engine_volume;
        this.mileage=mileage;
    }

    public long getprofile_id() {
        return profile_id;
    }

    public void setprofile_id(long profile_id) {
        this.profile_id = profile_id;
    }
 

    public String getcar_brand() {
        return car_brand;
    }

    public void setcar_brand(String car_brand) {
        this.car_brand = car_brand;
    }
    
    
    public String getcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }

    public int getyears_car() {
        return years_car;
    }

    public void setyears_car(int years_car) {
        this.years_car = years_car;
    }

    public String gettype_engine() {
        return type_engine;
    }

    public void settype_engine(String type_engine) {
        this.type_engine = type_engine;
    }
    
            
    public String gettype_of_gearbox() {
        return type_of_gearbox;
    }

    public void settype_of_gearbox(String type_of_gearbox) {
        this.type_of_gearbox = type_of_gearbox;
    }
    
    public int getengine_volume() {
        return engine_volume;
    }

    public void setengine_volume(int engine_volume) {
        this.engine_volume = engine_volume;
    }
    
    public int getmileage() {
        return mileage;
    }

    public void setmileage(int mileage) {
        this.mileage = mileage;
    }
   
            
            
    @Override
    public String toString() {
        return "Информация о лоте: [Profile_id: " + profile_id +
                ", car_brand: " + car_brand +
                ", country: " + country +
                ", years_car: " + years_car +
                ", type_engine: " + type_engine +
                ", type_of_gearbox: " + type_of_gearbox +
                ", engine_volume: " + engine_volume +
                ", mileage: " + mileage +
                "]";
    
    
    }
}