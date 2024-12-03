package com.mgh.pmdm.parques

import android.content.Context
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import java.lang.Exception
import java.util.*

// El objeto Parks contendrá una lista de parques, y
// representará nuestro modelo de datos

object Parks {

    // Internamente guardamos una lista de parques
    var parks: ArrayList<Park>

    init {
        parks = ArrayList<Park>()
    }

    fun populate(context: Context, resource: Int) {
        // Este método añadirá a la lista Parks todos los parques
        // definidos en el fichero res/raw/parks.json

        // Obtenemos un inputStream a partir del recurso JSON indicado y leemos el fichero
        val inputStream = context.resources.openRawResource(resource)
        // Lectura del stream. Con el delimitador \\A indicamos que se lea todo el fichero
        // obtenemos un String con el contenido del JSON
        val jsonString: String = Scanner(inputStream).useDelimiter("\\A").next()

        // Conversión del obbtejo a JSON
        val obj = (JSONTokener(jsonString)).nextValue() as JSONObject

        // Obtenemos el JSONArray del componente patks
        val jsa = obj["parks"] as JSONArray

        // Recorremos el JSONArray, creando los parques y añadiéndolos a la coleccción
        for (i in 0..jsa.length() - 1) {
            var park = jsa[i] as JSONObject

            try {
                parks.add(
                    Park(
                        park["name"] as String,
                        park["desc"] as String,
                        park["phone"] as String,
                        park["website"] as String,
                        park["openingTime"] as String,
                        park["closingTime"] as String,
                        park["sports"] as Boolean,
                        park["children"] as Boolean,
                        park["bar"] as Boolean,
                        park["pets"] as Boolean,
                    )
                )
            }
            catch(e:Exception){
                Log.e("[Park.kt]", e.toString())
            }
        }

    } // End populate

    // Metodo para añadir un parque
    fun add(parc:Park){
        parks.add(parc);
    }

    // Metodo para reemplazar un parque por otro
    fun replace(originalPark: Park, newPark:Park){
        val index= parks.indexOf(originalPark)
        parks[index]=newPark
    }

    // Metodo para eliminar un parque
    fun remove(originalPark: Park):Int{
        val index= parks.indexOf(originalPark)
        parks.remove(originalPark)
        return index // Retorna el índice del parque eliminado
    }

}


