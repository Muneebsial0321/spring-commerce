package app.Api.Shop;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import app.Base.JpaBaseEntity;

@Entity
@Table(name = "shop")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ShopEntity extends JpaBaseEntity {


}
