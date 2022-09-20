
/**
 * Write a description of class OrdenSegundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrdenSegundo implements Orden
{
    private Cocinero cocinero;
    private final int GASTO_SEGUNDO = 10;
    
    public OrdenSegundo(Cocinero cocinero){
        this.cocinero = cocinero;
    }
    
    public boolean execute(){
        if(cocinero.tieneEnergia(GASTO_SEGUNDO)){
            cocinero.prepararSegundo();
            return true;
        }
        
        return false;
    }
}
