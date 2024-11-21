package android.example.parques

import android.content.Intent
import android.example.parques.databinding.AboutActivityBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class AboutActivity : AppCompatActivity() {

    // Declaración de los elementos de la interfaz
    private lateinit var binding: AboutActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AboutActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.autor.textSize = 25F
        binding.version.textSize = 25F
        binding.creacion.textSize = 25F
        binding.modificacion.textSize = 25F
        binding.derechosAutor.textSize = 25F
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection.
        return when (item.itemId) {
            R.id.inicio -> {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
                true
            }
            R.id.añadir -> {
                startActivity(Intent(this, Parques::class.java))
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}