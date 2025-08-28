package app.Api.Category;

import app.Api.Product.models.ProductEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import app.Base.JpaBaseEntity;

import java.util.List;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CategoryEntity extends JpaBaseEntity {

    private String name;
    private String display_picture;
    List<ProductEntity> products;
}
