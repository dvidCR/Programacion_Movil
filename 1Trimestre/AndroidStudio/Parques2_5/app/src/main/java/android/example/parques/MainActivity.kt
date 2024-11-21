package android.example.parques

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    // Declaración de los elementos de la interfaz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombre = arrayOf("Parc de Capçalera. Valencia", "Parque del Retiro. Madrid", "Parc Güel. Barcelona")
        val desc = arrayOf("Zona verde en el antiguo cauce de Túria, con senderos para caminar o ir en bicicleta.", "Jardin historico y parque público.", "Parque público con jardines y elementos arquitectónicos")
        val parqueAdapter = ParqueAdapter(nombre, desc)

        val recyclerView: RecyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = parqueAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection.
        return when (item.itemId) {
            R.id.añadir -> {
                startActivity(Intent(this, Parques::class.java))
                finish()
                true
            }

            R.id.about -> {
                startActivity(Intent(this, AboutActivity::class.java))
                finish()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}