package android.example.proyecto2

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import android.example.proyecto2.databinding.ActivityMainBinding
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.SpinnerAdapter
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val spinner: Spinner = findViewById(R.id.sp)

        // Create a list of items for the spinner
        val items = listOf("SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR")

        // Create an ArrayAdapter using a simple spinner layout and the items list
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        spinner.adapter = adapter

        val num1=findViewById<EditText>(R.id.num1)
        val num2=findViewById<EditText>(R.id.num2)
        val tv=findViewById<TextView>(R.id.tv)

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val num1=findViewById<EditText>(R.id.num1)
            val nro1 = num1.text.toString().toInt()
            val nro2 = num2.text.toString().toInt()

            val calc: Int = when (spinner.selectedItem.toString()) {
                "SUMAR" -> nro1 + nro2
                "RESTAR" -> nro1 - nro2
                "MULTIPLICAR" -> nro1 * nro2
                "DIVIDIR" -> if (nro2 != 0) nro1 / nro2 else {
                    Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                else -> 0
            }
            tv.text = "Resultado: ${calc.toString()}"
        }

    }
}