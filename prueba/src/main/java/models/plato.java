package models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "plato")
public class plato {

    private long id;
    private String nombrePlato;
    private String descripcion;
    private double precio;

    private carta carta ;

}
