package app.Api.Reels;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import app.Base.JpaBaseEntity;

@Entity
@Table(name = "reels")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ReelsEntity extends JpaBaseEntity {

}
