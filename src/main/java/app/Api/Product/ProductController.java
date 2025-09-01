package app.Api.Product;

import app.Api.Product.ProductImpression.ProductImpressionService;
import app.Api.Product.dto.ProductImpressionCreateDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductImpressionService impressionService;

    @PostMapping
    public Object create(@RequestBody ProductEntity entity) {
        return productService.create(entity);
    }

    @GetMapping
    public Object getAll() {
        return productService.getAll();
    }

    @GetMapping("/s/{id}")
    public Object getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PutMapping("/{id}")
    public Object update(@PathVariable Long id, @RequestBody ProductEntity entity) {
        return productService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Long id) {
        return productService.delete(id);
    }

    //    Impressions
    @PutMapping("/impression")
    public Object addImpression(@Validated @RequestBody ProductImpressionCreateDto impressionCreateDto) {
         impressionService.addProductImpression(impressionCreateDto.getProductId(),impressionCreateDto.getUserId());
         return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    //    Reviews
    @PostMapping("/review")
    public Object addReviewToAProduct(@PathVariable Long id, @RequestBody ProductEntity entity) {
        return productService.update(id, entity);
    }

    @GetMapping("/review/s/{id}")
    public Object getReviewsOfAProduct(@PathVariable Long id, @RequestBody ProductEntity entity) {
        return productService.update(id, entity);
    }

    @PostMapping("/review/reply")
    public Object addReplyToAReview(@PathVariable Long id, @RequestBody ProductEntity entity) {
        return productService.update(id, entity);
    }

    @DeleteMapping("review/reply/{id}")
    public Object deleteReviewReply(@PathVariable Long id, @RequestBody ProductEntity entity) {
        return productService.update(id, entity);
    }

    @PutMapping("/review/{id}")
    public Object deleteReview(@PathVariable Long id, @RequestBody ProductEntity entity) {
        return productService.update(id, entity);
    }

}
