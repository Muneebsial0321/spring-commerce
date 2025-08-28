package app.Api.Product.repositories;

import app.Api.Product.models.ProductReviewReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewReplyRepository extends JpaRepository<ProductReviewReplyEntity,Long> {
}
