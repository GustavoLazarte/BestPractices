
/**
 * Write a description of class OrdenEspecial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrdenEspecial implements Orden
{
    private Cocinero cocinero;
    private final int GASTO_ESPECIAL = 15;
    
    public OrdenEspecial(Cocinero cocinero){
        this.cocinero = cocinero;
    }
    
    public boolean execute(){
        if(cocinero.tieneEnergia(GASTO_ESPECIAL)){
            cocinero.prepararEspecial();
            return true;
        }
        
        return false;
    }
}
