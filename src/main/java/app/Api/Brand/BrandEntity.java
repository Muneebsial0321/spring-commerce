package app.Api.Brand;

import app.Api.Product.models.ProductEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import app.Base.JpaBaseEntity;

import java.util.List;

@Entity
@Table(name = "brand")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BrandEntity extends JpaBaseEntity {
    private String name;
    private String display_picture;
    List<ProductEntity> products;
}
