
package jardinbotanico;


public class Arboles extends Plantas implements Podable{
    
    private double alturaMaxima ;

    public Arboles(double alturaMaxima, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public String toString() {
        return "Arboles{" + "alturaMaxima=" + alturaMaxima +" nombre = " + nombre +" ubicacion = "+ubicacion+ " clima = " + clima +'}';
    }

    
    
    @Override
    public void podar() {
        System.out.println("podando arboles:" + nombre);
    }
    
    
    
}
