package app.Api.Payments;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import app.Base.JpaBaseEntity;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class PaymentsEntity extends JpaBaseEntity {

}
