package app.Api.Product.models;

import app.Base.JpaBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "product_review_reply")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class ProductReviewReplyEntity extends JpaBaseEntity {
    private ProductReviewEntity review;
    private String text;
}
