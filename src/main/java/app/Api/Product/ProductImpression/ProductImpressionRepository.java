package app.Api.Product.ProductImpression;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImpressionRepository extends JpaRepository<ProductImpressionEntity,Long> {
}
