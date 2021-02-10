package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
/*
Esta clase administra la tabla persona
*/
@Data//Esta anotacion crea de manera automatica los metodos setters y getters
@Entity//Esta le da a la clase el atributo de entidad
@Table(name = "persona")//Esta castea la clase para que encage con el nombre de la tabla
public class Persona implements Serializable{//Al ser serializable la clase puede mandar al info a una base de datos y luego recuperarlos
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    @Email
    private String email;
    
    private String telefono;
    
    @NotNull
    private Double saldo;
}
