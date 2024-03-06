
/**
 * Identificador global único GUID (Global Unique IDentifier)
 * 
 * @author Aimar Ibarra
 * @version 0.1
 */
public class GUID
{
    /**
     * guid de la siguiente instancia
     */
    static private int siguiente_guid = 0;

    /**
     * Valor numérico que identifica la instancia
     */
    private final int guid;
    
    /**
     * Constructor simple
     */
    public GUID() {
        this.guid = siguiente_guid++;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other instanceof GUID o) {
            if (this.guid == o.guid) return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return guid;
    }
    
    @Override
    public String toString() {
        return Integer.toString(guid);
    }
}
