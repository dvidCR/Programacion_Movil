package android.example.proyect3

import android.example.proyect3.databinding.ActivityMainBinding
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private var listview: ListView? = null
    private val names: ArrayList<String>? = null

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

        val listview = findViewById<ListView>(R.id.list1)
        val tv = findViewById<TextView>(R.id.tv)

        val paises = listOf("Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Perú", "Surinam", "Trinidad", "Tobago", "Uruguay", "Venezuela")
        val habitantes = listOf(
            "45.892.285",  // Argentina
            "12.006.031",  // Bolivia
            "216.422.446", // Brasil
            "19.116.209",  // Chile
            "51.049.498",  // Colombia
            "18.197.000",  // Ecuador
            "790.000",     // Guyana
            "7.252.672",   // Paraguay
            "33.105.273",  // Perú
            "618.040",     // Surinam
            "1.399.488",   // Trinidad
            "1.399.488",   // Tobago
            "3.473.730",   // Uruguay
            "28.870.195"   // Venezuela
        )

        val nombre = ArrayAdapter(this, android.R.layout.simple_list_item_1, paises)

        listview.adapter = nombre

        listview.setOnItemClickListener { _, _, i, _ ->
            tv.textSize = 35F
            tv.textAlignment = View.TEXT_ALIGNMENT_CENTER
            tv.text = "Población de ${paises[i]}: ${habitantes[i]}"
        }
    }
}