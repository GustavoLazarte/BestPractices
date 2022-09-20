
/**
 * Write a description of class CommandOpen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrdenSopa implements Orden
{
    private Cocinero cocinero;
    private final int GASTO_SOPA = 5;
    
    public OrdenSopa(Cocinero cocinero){
        this.cocinero = cocinero;
    }
    
    public boolean execute(){
        if(cocinero.tieneEnergia(GASTO_SOPA)){
            cocinero.prepararSopa();
            return true;
        }else{
            return false;
        }
    }
}
