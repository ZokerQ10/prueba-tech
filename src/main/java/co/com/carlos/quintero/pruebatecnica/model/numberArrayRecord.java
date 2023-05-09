package co.com.carlos.quintero.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "numberArrayRecord")
public class numberArrayRecord {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;
    @ElementCollection
    @Column(name = "numero")
    private List<Integer> numeros;
}
