
/**
 * Representa un cambio de nombre de un empleado
 * 
 * @author Aimar Ibarra 
 * @version 0.1
 */
public class CambioNombre implements GestionAdministrativa
{
    private Empleado empleado;
    private String nombre_viejo;
    private String nombre_nuevo;
    public CambioNombre(Empleado empleado, String nombre_nuevo) {
        this.empleado = empleado;
        this.nombre_viejo = empleado.getNombre();
        this.nombre_nuevo = nombre_nuevo;
    }
    
    public String descripcion() {
        return "Id empleado:  " + empleado.getGuid() + "\n"
             + "Accion:       " + "cambio de nombre" + "\n"
             + "Nombre viejo: " + nombre_viejo       + "\n"
             + "Nombre nuevo: " + nombre_nuevo;
    }
}
