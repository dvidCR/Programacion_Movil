package android.example.curriculumapp.view.ui

import android.example.curriculumapp.R
import android.example.curriculumapp.model.CVAdapter
import android.example.curriculumapp.viewmodel.MenuSelector
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CVActivity : MenuSelector() {

    private val arrayTitulo = arrayOf("Contacto", "Sobre Mi", "Estudios", "Experiencia", "Idiomas")
    private lateinit var arrayDescripcion: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cv)

        initComponents()
        openFiles()
        sendToAdapter()
    }

    private fun initComponents() {
        arrayDescripcion = Array(arrayTitulo.size) { "" }
    }

    private fun openFiles() {
        for ((pos, titulo) in arrayTitulo.withIndex()) {
            val nombreFichero = titulo.replace(" ", "_") + ".txt"
            try {
                val file = assets.open("contenidoCV/$nombreFichero")
                val contenido = file.bufferedReader().use { it.readText() }

                arrayDescripcion[pos] = contenido
            } catch (e: Exception) {
                arrayDescripcion[pos] = "Error al cargar $titulo"
                e.printStackTrace()
            }
        }
    }

    private fun sendToAdapter() {
        val adapter = CVAdapter(arrayTitulo, arrayDescripcion)
        val recyclerView: RecyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
