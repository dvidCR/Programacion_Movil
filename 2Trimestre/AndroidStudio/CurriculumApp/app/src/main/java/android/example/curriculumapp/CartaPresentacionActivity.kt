package android.example.curriculumapp

import android.example.curriculumapp.databinding.ActivityAboutBinding
import android.example.curriculumapp.databinding.ActivityCartaPresentacionBinding
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CartaPresentacionActivity : MenuSelector() {

    private lateinit var binding: ActivityCartaPresentacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartaPresentacionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        manageSize()
        val contenido = openFiles()
        changeText(contenido)

    }

    private fun manageSize() {
        binding.tvCarta.textSize = 25F
    }

    private fun openFiles(): String {
        var contenido: String

        try {
            val file = assets.open("Carta_Presentacion.txt")
            contenido = file.bufferedReader().use { it.readText() }
        } catch (e: Exception) {
            contenido = "Error al cargar Carta_Presentacion.txt"
            e.printStackTrace()
        }

        return contenido
    }

    private fun changeText(contenido: String) {
        binding.tvCarta.text = contenido
    }
}