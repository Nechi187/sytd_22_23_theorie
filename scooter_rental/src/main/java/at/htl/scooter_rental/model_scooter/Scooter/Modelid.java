package at.htl.scooter_rental.model_scooter.Scooter;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Embeddable

public class Modelid implements Serializable {
    private static final long serialVersionUID = 6823669942572691723L;
    @Column(nullable = false, length = 100)
    private String modelLabel;


    @ManyToOne
    @JoinColumn(nullable = false)
    private Manufacturers manufacturers;
}
