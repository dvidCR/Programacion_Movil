package android.example.androidmaster.imcCalculator

import android.example.androidmaster.R
import android.example.androidmaster.imcCalculator.ImcCalculatorActivity.Companion.IMC_KEY
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ResultIMCActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initListeners()
        initUI(result)
    }

    private fun initComponents() {
        tvIMC = findViewById(R.id.tvIMC)
        tvResult = findViewById(R.id.tvResult)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when (result) {
            in 0.00..18.50 -> { // Bajo peso
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tvResult.text = getString(R.string.title_bajo_peso)
                tvDescription.text = getString(R.string.description_bajo_peso)
            }

            in 18.51..24.99 -> { // Peso normal
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tvResult.text = getString(R.string.title_medio_peso)
                tvDescription.text = getString(R.string.description_medio_peso)
            }

            in 25.00..29.99 -> { // Sobrepeso
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_sobrepeso))
                tvResult.text = getString(R.string.title_sobrepeso)
                tvDescription.text = getString(R.string.description_sobrepeso)
            }

            in 30.00..99.99 -> { // Obesidad
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvResult.text = getString(R.string.title_obeso)
                tvDescription.text = getString(R.string.description_obeso)
            }

            else -> { // Error
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvResult.text = getString(R.string.error)
                tvIMC.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }

}