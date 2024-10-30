package android.example.proyecto5

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import android.example.proyecto5.databinding.ActivityMainBinding
import android.widget.Button
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

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

        val max = 100000
        val min = 1
        val range = max - min + 1
        val numAleatorio = Random.nextInt(1, 100001)

        val tv1 = findViewById<TextView>(R.id.tv1)
        tv1.textSize = 35F

        val num = findViewById<EditText>(R.id.number)
        val boton = findViewById<Button>(R.id.button)

        boton.setOnClickListener {
            val userInput = num.text.toString().toIntOrNull()
            if (userInput != null) {
                when {
                    userInput == numAleatorio -> Toast.makeText(this, "Enorhabuena el numero es: ${numAleatorio}", Toast.LENGTH_LONG).show()
                    userInput < numAleatorio -> Toast.makeText(this, "Prueba con un número más grande", Toast.LENGTH_LONG).show()
                    userInput > numAleatorio -> Toast.makeText(this, "Prueba con un número más pequeño", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}