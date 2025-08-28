package app.Api.Product.models;

import app.Api.Auth.UserEntity;
import app.Base.JpaBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "product_review")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class ProductImpressionEntity extends JpaBaseEntity {
    private UserEntity user;
    private ProductEntity product;
}
