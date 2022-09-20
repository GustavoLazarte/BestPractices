
/**
 * Write a description of class OredenDieta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrdenDieta implements Orden
{
    private Cocinero cocinero;
    private final int GASTO_DIETA = 11;
    public OrdenDieta(Cocinero cocinero){
        this.cocinero = cocinero;
    }
    
    public boolean execute(){
        if(cocinero.tieneEnergia(GASTO_DIETA)){
            cocinero.prepararDieta();
            return true;
        }
        
        return false;
    }
}
