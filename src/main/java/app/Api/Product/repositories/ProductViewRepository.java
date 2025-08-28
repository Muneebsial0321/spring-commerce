package app.Api.Product.repositories;

import app.Api.Product.models.ProductViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductViewRepository extends JpaRepository<ProductViewEntity,Long> {
}
