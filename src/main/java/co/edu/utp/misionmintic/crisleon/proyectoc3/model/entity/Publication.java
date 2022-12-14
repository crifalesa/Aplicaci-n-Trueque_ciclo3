package co.edu.utp.misionmintic.crisleon.proyectoc3.model.entity;


import java.util.Date;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String tittle;
    private String description;
    private String status;   
    private String changeFor;
    private String contactNumber;
    private String imageUrl;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;
    
}
