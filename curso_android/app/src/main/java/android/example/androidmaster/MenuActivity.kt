package android.example.androidmaster

import android.content.Intent
import android.example.androidmaster.imcCalculator.ImcCalculatorActivity
import android.example.androidmaster.saludApp.FirstAppActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
}