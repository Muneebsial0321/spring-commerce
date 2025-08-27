package app.Services.Email;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import app.Base.JpaBaseEntity;

@Entity
@Table(name = "email")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class EmailEntity extends JpaBaseEntity {

}
