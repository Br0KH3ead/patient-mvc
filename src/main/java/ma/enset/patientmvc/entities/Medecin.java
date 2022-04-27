package ma.enset.patientmvc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min= 3, max =60)
    private String nom;
    @NotEmpty
    @Size(min= 4, max =60)
    private String prenom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datedenaissance;
    @NotEmpty
    @Size(min= 4, max =60)
    private String specialite;
    @DecimalMin("1")
    @DecimalMax("150")
    private int age;
    @NotEmpty
    @Size(min= 4, max =60)
    private String numtel;
    @NotEmpty
    @Size(min= 4, max =60)
    private String mail;
}
