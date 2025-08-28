package app.Api.Product.repositories;

import app.Api.Product.models.ProductReviewEntity;
import app.Api.Product.models.ProductViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewRepository extends JpaRepository<ProductReviewEntity,Long> {
}
