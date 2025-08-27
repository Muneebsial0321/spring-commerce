package app.Api.Order;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import app.Base.JpaBaseEntity;

@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OrderEntity extends JpaBaseEntity {

}
