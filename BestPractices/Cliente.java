
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    public static void main(String[] args){
        Cocinero cocinero = new Cocinero();
        Orden ordenSopa = new OrdenSopa(cocinero);
        Mesero mesero = new Mesero();
        
        mesero.ingresarNuevaOrden(ordenSopa);
        
        Orden ordenSegundo = new OrdenSegundo(cocinero);
        
        mesero.ingresarNuevaOrden(ordenSegundo);
    }
}
