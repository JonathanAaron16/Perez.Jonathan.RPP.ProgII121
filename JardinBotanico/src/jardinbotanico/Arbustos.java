
package jardinbotanico;


public class Arbustos extends Plantas implements Podable{
    
    private int dencidad;

    public Arbustos(int dencidad, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.dencidad = dencidad;
    }

    @Override
    public String toString() {
        return "Arbustos{" + "dencidad=" + dencidad + " nombre = " + nombre +" ubicacion = "+ubicacion+ " clima = " + clima +'}';
    }

    
    
    @Override
    public void podar() {
        System.out.println("podando arbusto : "+ nombre);
    }
    
    
    
    
    
}
