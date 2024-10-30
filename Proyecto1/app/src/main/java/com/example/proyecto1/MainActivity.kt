package com.example.proyecto1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.proyecto1.databinding.ActivityMainBinding

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

        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        var r1:RadioButton?=null
        r1 = findViewById(R.id.suma)
        var r2:RadioButton?=null
        r2 = findViewById(R.id.resta)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var calc = 0
            val et1=findViewById<EditText>(R.id.et1)
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            if (r1.isChecked) {
                calc = nro1 + nro2
            } else if (r2.isChecked) {
                calc = nro1 - nro2
            }

            tv1.text = "Resultado: ${calc.toString()}"
        }
    }
}