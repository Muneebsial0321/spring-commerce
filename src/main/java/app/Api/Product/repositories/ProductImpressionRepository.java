package app.Api.Product.repositories;

import app.Api.Product.models.ProductImpressionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImpressionRepository extends JpaRepository<ProductImpressionEntity,Long> {
}
