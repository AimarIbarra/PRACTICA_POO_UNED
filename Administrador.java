import java.util.Date;
import java.util.ArrayList;

/**
 * Clase de los administradores
 * 
 * @author Aimar Ibarra
 * @version 0.1
 */
public class Administrador extends Empleado
{   
    /**
     * Todas las acciones que ha realiza este administrador
     */    
    private ArrayList<GestionAdministrativa> gestiones;
    
    /**
     * Constructor simple
     */
    public Administrador(String nombre)
    {
        super(nombre);
    }
    
    /**
     * Implementación del metodo abstracto
     */
    public String getUnidad() {
        return "Administración";
    }
    
    /**
     * Cambia el nombre de un empleado
     * @param emple  El empleado en cuestioón
     * @param nombre El nuevo nombre del empleado
     */
    public void setNombre(Empleado emple, String nombre) {
        emple.nombre = nombre;
    }

    /**
     * Cambia la fecha de alta de un empleado, o bien le da de alta
     * @param emple El empleado en cuestión
     * @param alta  La fecha de alta
     */
    public void setAlta(Empleado emple, Date alta) {
        emple.alta = alta;
    }
    
    /**
     * Cambia la fecha de baja de un empleado, o bien le da de baja
     * @param emple El empleado en cuestión
     * @param baja  La fecha de baja
     */
    public void setBaja(Empleado emple, Date baja) {
        emple.baja = baja;
    }
    
    /**
     * @return
     */
    public String generar_informe() {
        String informe = "Empleado:  " + getNombre()      + "\n"
                       + "Puesto:    " + "administracion" + "\n"
                       + "Gestiones: " + gestiones.size() + "\n";
        for (GestionAdministrativa ges : gestiones) {
            informe += ges.descripcion() + "\n";
        }
        return informe;
    }
}
