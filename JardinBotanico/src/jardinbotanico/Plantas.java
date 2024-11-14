
package jardinbotanico;

import java.util.Objects;


public abstract class Plantas {
    protected String nombre;
    protected String ubicacion;
    protected String clima;

    public Plantas(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Si son el mismo objeto
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Si es null o no es de la misma clase
        }

        Plantas that = (Plantas) obj;
        return ubicacion == that.ubicacion && nombre.equals(that.nombre);
    }
    
    @Override
    public int hashCode() {
        return  Objects.hash(nombre, ubicacion);
    }
    
    
}
