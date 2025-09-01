package app.Api.Product.ProductReview;

import app.Api.Auth.UserEntity;
import app.Api.Product.ProductEntity;
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
public class ProductReviewEntity extends JpaBaseEntity {
    private UserEntity user;
    private ProductEntity product;
    private String text;
    private Integer ratings;
}
