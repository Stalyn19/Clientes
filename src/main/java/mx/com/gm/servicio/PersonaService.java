package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;
/*Esta interfaz propone los metodos a utilizar en la capa de servicio 
 Los adquiere de los Data Access Objects
*/
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
