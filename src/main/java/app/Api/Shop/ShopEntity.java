package app.Api.Shop;

import app.Api.Product.ProductEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import app.Base.JpaBaseEntity;

import java.util.List;

@Entity
@Table(name = "shop")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ShopEntity extends JpaBaseEntity {

    private String name;
    private String description;
    private String display_picture;
    private String cover_picture;
    private String address;
    private String city;
    private String country;
    private String website_url;
    private String facebook_url;
    private String instagram_url;
    private String whatsapp_number;
    private List<String> shop_images;
    private List<ProductEntity> products ;

}
