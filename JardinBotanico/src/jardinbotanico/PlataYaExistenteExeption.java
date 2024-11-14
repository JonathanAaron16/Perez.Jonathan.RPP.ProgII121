
package jardinbotanico;

// Excepción personalizada para cuando la planta ya existe
public class PlataYaExistenteExeption extends RuntimeException{
    private final static String MESSANGE ="ya exite la planta";
    
     public PlataYaExistenteExeption() {
        super(MESSANGE);
    }
}
