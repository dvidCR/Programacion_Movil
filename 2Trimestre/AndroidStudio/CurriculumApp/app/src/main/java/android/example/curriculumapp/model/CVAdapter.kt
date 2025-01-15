package android.example.curriculumapp.model

import android.example.curriculumapp.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CVAdapter(private val titulo: Array<String>, private val desc: Array<String>) : RecyclerView.Adapter<CVAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitulo: TextView
        val tvDescripcion: TextView

        init {
            tvTitulo = view.findViewById(R.id.tvTitulo)
            tvDescripcion = view.findViewById(R.id.tvDescripcion)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.informacion_cv, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvTitulo.text = titulo[position]
        viewHolder.tvDescripcion.text = desc[position]

    }

    override fun getItemCount() = titulo.size and desc.size

}