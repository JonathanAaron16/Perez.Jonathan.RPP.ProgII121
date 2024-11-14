package jardinbotanico;

import java.util.ArrayList;
import java.util.List;

public class Botanico {

    private List<Plantas> plantas;

    public Botanico() {
        plantas = new ArrayList<>();
    }

    public void agregarPlanta(Plantas Planta) {
        // Verificar si ya existe la planta
        if (plantas.contains(Planta)) {
            throw new PlataYaExistenteExeption();
        }
        // Si no existe, agregar la nueva planta
        plantas.add(Planta);
    }

    public void mostrarPlantas() {
        for (Plantas p : plantas) {
            System.out.println(p);
        }
    }

    public void podarPlantas() {
        for (Plantas podar : plantas) {
            if (podar instanceof Arboles || podar instanceof Arbustos) {
                // Si es un arbool o arbusto, se puede podar
                ((Podable) podar).podar();
            } else {
                // Informar que no se puede podar
                System.out.println("La flores " + podar.nombre + " no es podable.");
            }
        }
    }
}
