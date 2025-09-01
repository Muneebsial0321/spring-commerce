package app.Api.Product.ProductImpression;

import app.Api.Auth.UserEntity;
import app.Api.Product.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ProductImpressionService {

    @Autowired
    private ProductImpressionRepository repository;

    @Async
    public void addProductImpression(Long productId,Long userId){
        var impression = ProductImpressionEntity.builder()
                .user(UserEntity.builder().id(userId).build())
                .product(ProductEntity.builder().id(productId).build())
                .build();
        this.repository.save(impression);
    }
}
