package models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "restaurante")
public class restaurante {
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    private List<carta> listaCarta;
}

