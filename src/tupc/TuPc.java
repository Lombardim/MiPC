package tupc;

import java.util.ArrayList;

public class TuPc {

    private ArrayList<Bodega> bodegas;

    public TuPc() {
        
        bodegas = new ArrayList<>();
        bodegas.add(new Bodega(01));
        bodegas.add(new Bodega(02));
        bodegas.add(new Bodega(03));
        
    }

    public static void main(String[] args) {
    }
}
