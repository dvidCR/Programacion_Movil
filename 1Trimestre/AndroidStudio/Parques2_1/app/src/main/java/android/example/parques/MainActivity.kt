package android.example.parques

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import android.example.parques.databinding.ActivityMainBinding
import android.util.Log
import android.util.LogPrinter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Declaración de los elementos de la interfaz
    private lateinit var imageView: ImageView
    private lateinit var nameEditText: EditText
    private lateinit var description: EditText
    private lateinit var phone: EditText
    private lateinit var spinner1: Spinner
    private lateinit var spinner2: Spinner
    private lateinit var sports: CheckBox
    private lateinit var childrenPark: CheckBox
    private lateinit var bar: CheckBox
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enlace de los elementos de la interfaz
        imageView = findViewById(R.id.imageView3)
        nameEditText = findViewById(R.id.editTextText)
        description = findViewById(R.id.editTextText2)
        phone = findViewById(R.id.editTextPhone)
        spinner1 = findViewById(R.id.spinner)
        spinner2 = findViewById(R.id.spinner2)
        sports = findViewById(R.id.checkBox)
        childrenPark = findViewById(R.id.checkBox2)
        bar = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)


        // Configuración de acción para el botón "Guardar"
        button.setOnClickListener {
            saveData()
        }
    }

    // Función para guardar los datos ingresados
    private fun saveData() {
        try {
            // Obtén los datos de los campos de texto y otros elementos
            val name = nameEditText.text.toString()
            val descripcion = description.toString()
            val telefono = phone.toString()
            val sp1 = spinner1.toString()
            val sp2 = spinner2.toString()
            val chb1 = sports.isChecked.toString()
            val chb2 = childrenPark.isChecked.toString()
            val chb3 = bar.isChecked.toString()


            // Mostrar datos en Logcat
            Log.d(
                "MainActivity",
                "Datos guardados: Nombre=$name, Descripción=$descripcion, Teléfono=$telefono, Horario de entrada=$sp1, Horario de salida=$sp2, Evento=$chb1 $chb2 $chb3"
            )

            // Mostrar un mensaje breve de éxito en el Toast
            Toast.makeText(this, "Se a guardado exitosamente", Toast.LENGTH_SHORT).show()

        } catch (e: Exception) {
            val error:String = e.printStackTrace().toString()
            // Mostrar un mensaje breve de error en el Toast
            Toast.makeText(this, "Ha fallado\n$error", Toast.LENGTH_SHORT).show()

        }
    }
}