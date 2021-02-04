import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> cadena;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        cadena = new ArrayList<String>();
        cadena.add("¿Que tal te ha ido el dia?");
        cadena.add("Es interesante");
        cadena.add("Gracias!!");
        cadena.add("A mi tambien me gusta eso.");
        cadena.add("Eres muy agradable");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int aleat = aleatorio.nextInt(cadena.size());
        String resultado = cadena.get(aleat);
        return resultado;
    }
}
