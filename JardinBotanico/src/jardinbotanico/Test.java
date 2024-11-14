
package jardinbotanico;


public class Test {

    public static void main(String[] args) {
        Botanico botanico = new Botanico();
        
        Arboles arbol1 = new Arboles(5, "arbol1", "lugar1", "clima1");
        Arboles arbol2 = new Arboles(10, "arbol1", "lugar1", "clima1");
        
        Arbustos arbusto1 = new Arbustos(2, "arbusto1", "lugar1", "clima1");
        Arbustos arbusto2 = new Arbustos(2, "arbusto1", "lugar1", "clima1");
        
        Flores flores1 = new Flores(TemporadaFlores.PRIMAVERA, "flores1", "lugar1", "clima1");
        

        
        try {
            botanico.agregarPlanta(arbol1);

            botanico.agregarPlanta(arbusto1);
            
            botanico.agregarPlanta(flores1);

            botanico.agregarPlanta(arbol2);// Esto lanzará la excepción
            botanico.agregarPlanta(arbusto2);// Esto lanzará la excepción

        } catch (PlataYaExistenteExeption e) {
            System.out.println(e.getMessage());
        }
        
        
        // Mostrar todas las plantas
        botanico.mostrarPlantas();
        // podar todas las plantas posible
        botanico.podarPlantas();
        
    }
    
}
