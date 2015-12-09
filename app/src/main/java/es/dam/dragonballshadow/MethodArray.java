package es.dam.dragonballshadow;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Alvaro on 8/12/15.
 */
public class MethodArray {
    //Array con todos los personajes
    private static ArrayList<DragonBall> listaDragonBall = new ArrayList<>(Arrays.asList(
            new DragonBall(0, "gohan", "gohan_sombra")
            , new DragonBall(1, "goku", "goku_sombra")
            , new DragonBall(2, "kaio", "kaio_sombra")
            , new DragonBall(3, "goten", "goten_sombra")
            , new DragonBall(4, "krilin", "krilin_sombra")
    ));

    public static int NUMEROGENERADO =0;

    //devuelve el nombre de la sombra, que coincide con el nombre de la imagen a color
    //Muy importante que siempre coincida el String sombra con el nombre de la imagen que tenemos almacenada en drawable
    public static String getNombre(int id)
    {
        return listaDragonBall.get(id).getNombre().toLowerCase();
    }

    /*devuelve el nombre de la sombra, que coincide con el nombre de la imagen sombreada
    Muy importante que siempre coincida el String sombra con el nombre de la imagen que tenemos almacenada en drawable*/

    public static String getSombra(int id)
    {
        return listaDragonBall.get(id).getSombra().toLowerCase();
    }

    //Devuelte el temaño de nuestra "base de datos-array"
    public static int getTamaño()
    {
        return listaDragonBall.size();
    }


    /*Metodo para comprobar si el boton pulsado es el correcto.
    Comprueba si el nombre del boton es igual al nombre del personaje*/
    public static boolean checkResult(String x)
    {
        return listaDragonBall.get(NUMEROGENERADO).getNombre().equalsIgnoreCase(x);
    }

}
