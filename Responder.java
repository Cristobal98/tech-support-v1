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
    private HashMap <HashSet<String>, String> respuestas;
    private HashSet <String> respuesta1;
    private HashSet <String> respuesta2;
    private HashSet <String> respuesta3;
    private HashSet <String> respuesta4;
     
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        cadena = new ArrayList<String>();
        respuestas = new HashMap<>();
        respuesta1 = new HashSet <>();
        respuesta2 = new HashSet <>();
        respuesta3 = new HashSet <>();
        respuesta4 = new HashSet <>();
        cadena.add("¿Que tal te ha ido el dia?");
        cadena.add("Es interesante");
        cadena.add("Gracias!!");
        cadena.add("A mi tambien me gusta eso.");
        cadena.add("Eres muy agradable");
        respuesta1.add("estoy");
        respuesta1.add("muy");
        respuesta1.add("bien");
        respuesta2.add("yo");
        respuesta2.add("estoy");
        respuesta2.add("triste");
        respuesta3.add("tengo");
        respuesta3.add("un");
        respuesta3.add("problema");
        respuesta4.add("eres");
        respuesta4.add("muy");
        respuesta4.add("agradable");
        respuestas.put(respuesta1, "Me alegro, a mi tambien me ha ido bien");
        respuestas.put(respuesta2, "¿Por que estas triste?");
        respuestas.put(respuesta3, "Cuentamelo, quiza puedo ayudarte");
        respuestas.put(respuesta4, "Gracias, tu tambien eres agradable");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        String resultado = null;
        int maximo = 0;  
        for (HashSet<String> res : respuestas.keySet()){
            int contador = 0;
            for (String resp : res){
                if (userInput.contains(resp) == true){
                    contador ++;
                    if (contador > maximo) {
                        maximo = contador;
                        resultado = respuestas.get(res);
                    }
                }
            }
        }
        
        if (resultado == null){
            int aleat = aleatorio.nextInt(cadena.size());
            resultado = cadena.get(aleat);
        }
        return resultado;
    }
}
