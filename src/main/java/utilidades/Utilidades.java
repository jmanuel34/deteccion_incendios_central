/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.google.gson.Gson;
import java.time.LocalDate;
import model.Ficha;
/**
 *
 * @author Antonio
 */
public class Utilidades {
    public static Ficha obtenerFicha(String input) {
	Gson gson = new Gson()
            .newBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
            .create();
        //try ( InputStreamReader reader = new InputStreamReader(input);) {
            Ficha ficha = gson.fromJson(input, Ficha.class);
            return ficha;

        /*catch (IOException e) {

            e.printStackTrace();
            return null;
        }*/
    }
}
