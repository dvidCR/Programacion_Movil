package android.example.parques

import android.app.AlertDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.example.parques.databinding.ActivityMainBinding
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

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
                AlertDialog.Builder(this)
                    .setTitle("Confirmación")
                    .setMessage("Nombre: " + binding.editTextText.text + "\n" +
                            "Descripción:" + binding.editTextText2.text + "\n" +
                            "Telefono: " + binding.editTextPhone.text + "\n" +
                            "Web: " + binding.textView.text + "\n" +
                            "Hora de apertura: " + binding.spinner.selectedItem + "\n" +
                            "Hora de cierre: " + binding.spinner2.selectedItem + "\n" +
                            "Con instalaciones Deportivas: " + binding.checkBox.isChecked + "\n" +
                            "Con instalaciones para niños: " + binding.checkBox2.isChecked + "\n" +
                            "Con zona de restauración: " + binding.checkBox3.isChecked + "\n" +
                            "Con zona para perros: " + binding.checkBox4.isChecked + "\n" +
                            "¿Está seguro que desea guardar los datos?")
                    .setCancelable(false)
                    .setPositiveButton(android.R.string.ok) { dialog, which ->
                        Log.d("Caso Práctico 2", "Nombre: " + binding.editTextText.text)
                        Log.d("Caso Práctico 2", "Descripción:" + binding.editTextText2.text)
                        Log.d("Caso Práctico 2", "Telefono: " + binding.editTextPhone.text)
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

                        Snackbar.make(
                            binding.root,
                            "Se han guardado los datos",
                            Snackbar.LENGTH_LONG
                        ).show()
                    }
                    .setNegativeButton(android.R.string.cancel) { dialog, which ->
                        Toast.makeText(
                            applicationContext,
                            "Se ha cancelado la acción",
                            Toast.LENGTH_SHORT
                        ).show()
                    }.show()
            } catch (e: Exception) {
                val error:String = e.printStackTrace().toString()
                // Mostrar un mensaje breve de error en el Toast
                Toast.makeText(this, "Ha fallado\n$error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}