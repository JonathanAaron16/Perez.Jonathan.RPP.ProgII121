
package jardinbotanico;


public class Flores extends Plantas{
    private TemporadaFlores temporadaFlores;

    public Flores(TemporadaFlores temporadaFlores, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.temporadaFlores = temporadaFlores;
    }

    
    
    @Override
    public String toString() {
        return "Flores{" + "temporadaFlores=" + temporadaFlores + " nombre = " + nombre +" ubicacion = "+ubicacion+ " clima = " + clima +'}';
    }
    
    
}
