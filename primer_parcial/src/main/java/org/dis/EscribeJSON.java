package org.dis;//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json
import com.opencsv.*;

import java.io.FileReader;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import com.google.gson.*; //gson
import com.google.gson.reflect.TypeToken;

public class EscribeJSON {

    private static final String dir_json = "org\\thegitbrothers\\datos\\videotecas.json";

    public static void crearFicheroJson(ArrayList<golfPlayer> videotecas){
        try{
            FileWriter mywriter = new FileWriter(dir_json);
            mywriter.write(new Gson().toJson(videotecas));
            mywriter.close();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

}
