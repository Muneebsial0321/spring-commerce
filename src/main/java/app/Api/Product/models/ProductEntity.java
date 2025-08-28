package app.Api.Product.models;

import app.Api.Brand.BrandEntity;
import app.Api.Category.CategoryEntity;
import app.Api.Shop.ShopEntity;
import app.Base.JpaBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class ProductEntity extends JpaBaseEntity {

    private String name;
    private String description;
    private String display_picture;
    private List<String> tags;
    private List<String> size;
    private List<String> colours;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer currentStock;
    private BrandEntity brand;
    private CategoryEntity category;
    private ShopEntity shop;
}
