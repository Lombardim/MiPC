package tupc;

public class Portatil extends Equipo {
    
    private float peso, diametrop;

    public Portatil(String serial, String marca, String modelo, Procesador procesador, DiscoDuro discoduro, float memoriaram, float peso, float diametrop) {
        
        super(serial, marca, modelo, procesador, discoduro, memoriaram);
        this.peso = peso;
        this.diametrop = diametrop;
        
    }

   

    
    
}