import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Invoker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mesero
{
    private List<Orden> historialOrdenes;
    
    public Mesero(ArrayList<Orden> ordenes){
        this.historialOrdenes = ordenes;
    }
    
    public Mesero(){
        this.historialOrdenes = new ArrayList<>();
    }
    
    public void ingresarNuevaOrden(Orden nuevaOrden){
        if(nuevaOrden.execute())historialOrdenes.add(nuevaOrden);
    }
}
