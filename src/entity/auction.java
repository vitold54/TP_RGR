package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "auction")
public class auction {
    @Id
    @Column(name = "id", nullable=false)
    private long id;

    
    @Column(name = "lot_id", nullable=false)
    private long lot_id;

    
    @Column(name = "seller_id", nullable=false)
    private long seller_id;
    
    
    @Column(name = "buyer_id", nullable=false)
    private long buyer_id;

    @Column(name = "first_price", nullable=false)
    private int first_price;
    
    @Column(name = "price_buy", nullable=false)
    private int price_buy;
    
     
    public auction() {
    }

    public auction(long lot_id, long seller_id, long buyer_id, int first_price, int price_buy) {
        this.lot_id = lot_id;
        this.seller_id = seller_id;
        this.buyer_id=buyer_id;
        this.first_price=first_price;
        this.price_buy=price_buy;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getlot_id() {
        return lot_id;
    }

    public void setlot_id(long lot_id) {
        this.lot_id = lot_id;
    }

    public long getseller_id() {
        return seller_id;
    }

    public void setseller_id(long seller_id) {
        this.seller_id = seller_id;
    }
    
    
    public long getbuyer_id() {
        return buyer_id;
    }

    public void setbuyer_id(long buyer_id) {
        this.buyer_id = buyer_id;
    }
    
    
    public int getfirst_price() {
        return first_price;
    }

    public void setfirst_price(int first_price) {
        this.first_price = first_price;
    }
    
    public int getprice_buy() {
        return price_buy;
    }

    public void setprice_buy(int price_buy) {
        this.price_buy = price_buy;
    }
    
    
    


    @Override
    public String toString() {
        return "Auction [ID: " + id +
                ", lot_id: " + lot_id +
                ", seller_id: " + seller_id +
                ", buyer_id: " + buyer_id +
                ", first_price: " + first_price +
                ", price_buy: " + price_buy +
                "]";
}
}