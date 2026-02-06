

package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonSerializable.Base;

import uk.co.jemos.podam.common.PodamExclude;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DirectoEntity extends BaseEntity {
    private String nombre;
    private String biografia;

    private String nombre;
    private String nacionalidad;

    @ManyToMany(mappedBy = "actores")
    private List<PeliculaEntity> peliculas = new ArrayList<>();

}
