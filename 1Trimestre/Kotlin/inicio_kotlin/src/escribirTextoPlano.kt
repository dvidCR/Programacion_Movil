import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

fun escribirTextoPlano() {
    var fichero: FileWriter? = null
    var escritor: PrintWriter? = null

    try {
        fichero = FileWriter("archivo.txt");
        escritor = PrintWriter(fichero) ;
        escritor.println("Esto es una linea del fichero");
    } catch (ioe: IOException) {
        ioe.printStackTrace() ;
    } finally {
        if (fichero != null)
            try {
                fichero.close();
            } catch (ioe: IOException) {
                ioe.printStackTrace() ;
            }
    }
}