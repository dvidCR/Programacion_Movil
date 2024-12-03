package android.example.parques

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ParqueAdapter(private val name: Array<String>, private val desc: Array<String>) : RecyclerView.Adapter<ParqueAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView
        val descView: TextView

        init {
            // Define click listener for the ViewHolder's View
            nameView = view.findViewById(R.id.parkName)
            descView = view.findViewById(R.id.parkDesc)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.parque_card, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.nameView.text = name[position]
        viewHolder.descView.text = desc[position]

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = name.size and desc.size

}