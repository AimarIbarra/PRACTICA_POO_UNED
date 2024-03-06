import java.util.Date;

/**
 * Superclase de todos los empleados
 * 
 * @author Aimar Ibarra
 * @version 0.1
 */
public abstract class Empleado
{   
    /**
     * Identificador único del empleado
     */
    private final GUID guid;
    
    /**
     * Nombre del empleado
     */
    protected String nombre;

    /**
     * Fecha de alta
     */
    protected Date alta;
    
    /**
     * Fecha de baja
     */
    protected Date baja;
    
    /**
     * Constructor simple
     * @param nombre Nombre del empleado, si null, se utilizara "N/A"
     * @param unidad Unidad a la que el empleado pertenece
     */
    public Empleado(String nombre)
    {
        this.nombre = nombre == null ? "N/A" : nombre;
        this.guid = new GUID();
    }
    
    /**
     * @return La unidad a la que pertenece el empleado
     */
    public abstract String getUnidad();
    
    /**
     * @return El nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @return La fecha de alta del empleado
     */
    public Date getAlta() {
        return alta;
    }
    
    /**
     * @return El guid del empleado
     */
    public GUID getGuid() {
        return guid;
    }
    
    /**
     * @return La fecha de baja del empleado
     */
    public Date getBaja() {
        return baja;
    }
    
    /**
     * Genera el informe de lo que ha hecho el empleado
     * @return El informe en cuestión
     */
    public abstract String generar_informe();
    
    /**
     * Utilizamos el guid del empleado para identificarlo
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other instanceof Empleado emple) {
            return this.guid.equals(emple.guid);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return guid.hashCode();
    }
    
    @Override
    public String toString() {
        return "Nombre:     " + nombre + "\n"
             + "Fecha alta: " + alta   + "\n"
             + "Fecha baja: " + baja   + "\n"
             + "Unidad:     " + getUnidad();
    }
}
