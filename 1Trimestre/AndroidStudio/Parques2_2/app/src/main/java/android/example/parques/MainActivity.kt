package android.example.parques

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.example.parques.databinding.ActivityMainBinding
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Declaración de los elementos de la interfaz
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            try {
                Log.d("Caso Práctico 2", "Nombre: " + binding.editTextText.text)
                Log.d("Caso Práctico 2", "Descripción:" + binding.editTextText2.text)
                Log.d("Caso Práctico 2", "telefono: " + binding.editTextPhone.text)
                Log.d("Caso Práctico 2", "Web: " + binding.textView.text)
                Log.d("Caso Práctico 2", "Hora de apertura: " + binding.spinner.selectedItem)
                Log.d("Caso Práctico 2", "Hora de cierre: " + binding.spinner2.selectedItem)
                if (binding.checkBox.isChecked)
                    Log.d("Práctico 2", "Con instalaciones Deportivas")
                if (binding.checkBox2.isChecked)
                    Log.d("Práctico 2", "Con instalaciones para niños")
                if (binding.checkBox3.isChecked)
                    Log.d("Práctico 2", "Con zona de restauración")
                if (binding.checkBox4.isChecked)
                    Log.d("Práctico 2", "Con zona para perros")

                // Mostrar un mensaje breve de éxito en el Toast
                Toast.makeText(this, "Se a guardado exitosamente", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                val error:String = e.printStackTrace().toString()
                // Mostrar un mensaje breve de error en el Toast
                Toast.makeText(this, "Ha fallado\n$error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}