
/**
 * Write a description of class Microondas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cocinero
{
    private int energia;
    private final int ENERGIA_MAXIMA = 50;
    public Cocinero(){
        energia = ENERGIA_MAXIMA;
    }
    
    public void prepararSopa(){;
        System.out.println("sopa preparada");
    }
    
    public void prepararSegundo(){
        System.out.println("segundo preparado");
    }
    
    public void prepararDieta(){
        System.out.println("dieta preparada");
    }
    
    public void prepararEspecial(){
        System.out.println("especial preparado");
    }
    
    public void desgastarEnergia(int costo){
        energia = energia - costo;
    }
    
    public boolean tieneEnergia(int costo){
        if(energia >= costo) {
            desgastarEnergia(costo);
            return true;
        }else{
            return false;
        }
    }
}
