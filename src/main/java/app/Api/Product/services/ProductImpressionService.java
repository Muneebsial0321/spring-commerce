package app.Api.Product.services;

import app.Api.Product.repositories.ProductImpressionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ProductImpressionService {

    @Autowired
    private ProductImpressionRepository repository;

    @Async
    Object addProductImpression(Long productId){
        return "";
    }
}
