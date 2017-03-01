package tupc;

public abstract class Equipo{
    
    private Procesador procesador;
    private DiscoDuro discoduro;
    private float memoriaram;
    private String serial, marca, modelo;
    private Bodega bodega;

    public Equipo(String serial, String marca, String modelo, Procesador procesador, DiscoDuro discoduro, float memoriaram) {
        
        this.modelo = modelo;
        this.marca = marca;
        this.procesador = procesador;
        this.serial = serial;
        this.discoduro = discoduro;
        this.memoriaram = memoriaram;

    }

    public DiscoDuro getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(DiscoDuro discoduro) {
        this.discoduro = discoduro;
    }
    
    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
    
}
