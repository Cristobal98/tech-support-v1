import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
    private HashMap <String, String> respuestas;
     
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        cadena = new ArrayList<String>();
        respuestas = new HashMap<>();
        cadena.add("¿Que tal te ha ido el dia?");
        cadena.add("Es interesante");
        cadena.add("Gracias!!");
        cadena.add("A mi tambien me gusta eso.");
        cadena.add("Eres muy agradable");
        respuestas.put("bien", "Me alegro, a mi tambien me ha ido bien");
        respuestas.put("triste", "¿Por que estas triste?");
        respuestas.put("problema", "Cuentamelo, quiza puedo ayudarte");
        respuestas.put("placer", "El placer es mio");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        String resultado = null;
        Iterator <String> ite = userInput.iterator();
        String cadenas = "";
        while (resultado == null && ite.hasNext()){
            cadenas = ite.next();
            resultado = respuestas.get(cadenas);
        }
        
        if (resultado == null){
            int aleat = aleatorio.nextInt(cadena.size());
            resultado = cadena.get(aleat);
        }
        return resultado;
    }
}
