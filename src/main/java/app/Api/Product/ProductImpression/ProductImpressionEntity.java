package app.Api.Product.ProductImpression;

import app.Api.Auth.UserEntity;
import app.Api.Product.ProductEntity;
import app.Base.JpaBaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(
        name = "product_impression",
        uniqueConstraints = {@UniqueConstraint(name = "uk_user_product", columnNames = { "user_id","product_id" })}
)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class ProductImpressionEntity extends JpaBaseEntity {
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private ProductEntity product;

    private Integer impressions = 0;
}
