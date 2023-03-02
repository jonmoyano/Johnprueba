package models;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "cliente")
public class cliente {
    private  Long id;
    private String nombre;
    private String cedula;
    private String correo;

    private List<restaurante> listaRestaurante;
}

