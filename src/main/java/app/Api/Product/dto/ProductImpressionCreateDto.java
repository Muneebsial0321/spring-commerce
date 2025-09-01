package app.Api.Product.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductImpressionCreateDto {

    @NotBlank
    private Long userId;

    @NotBlank
    private Long productId;
}
