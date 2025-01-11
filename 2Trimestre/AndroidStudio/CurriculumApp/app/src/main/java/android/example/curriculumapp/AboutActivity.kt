package android.example.curriculumapp

import android.example.curriculumapp.databinding.ActivityAboutBinding
import android.example.curriculumapp.databinding.ActivityCartaPresentacionBinding
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AboutActivity : MenuSelector() {

    private lateinit var binding:ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        manageSize()
        changeText()
    }

    private fun manageSize() {
        binding.tvDesarrollador.textSize = 25F
        binding.tvVersion.textSize = 25F
        binding.tvFechaCreacion.textSize = 25F
        binding.tvFechaUltimaActualizacion.textSize = 25F
        binding.tvCopyright.textSize = 25F
    }

    private fun changeText() {
        binding.tvDesarrollador.text = "Desarrollado por: David Casado Rodríguez"
        binding.tvVersion.text = "Versión 1.0.0"
        binding.tvFechaCreacion.text = "Fecha de creacion: 09 - 01 - 2025"
        binding.tvFechaUltimaActualizacion.text = "Fecha de última actualización: 09 - 01 - 2025"
    }
}