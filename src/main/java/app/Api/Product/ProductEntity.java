package app.Api.Product;

import app.Base.JpaBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
    private Integer originalPrice;
    private Integer salePrice;
}
