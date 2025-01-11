package android.example.androidmaster.imcCalculator

import android.content.Intent
import android.example.androidmaster.R
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var currentWeigth: Int = 70
    private var currentAge: Int = 30
    private var currentHeigth: Int = 120

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeigth: TextView
    private lateinit var rsHeigth: RangeSlider
    private lateinit var btnSubtractWeigth: FloatingActionButton
    private lateinit var btnPlusWeigth: FloatingActionButton
    private lateinit var tvWeigth: TextView
    private lateinit var btnSubtractAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var tvAge: TextView
    private lateinit var btnCalculate: Button

    companion object {
        const val IMC_KEY = "IMC_RESULT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeigth = findViewById(R.id.tvHeigth)
        rsHeigth = findViewById(R.id.rsHeigth)
        btnSubtractWeigth = findViewById(R.id.btnSubtractWeigth)
        btnPlusWeigth = findViewById(R.id.btnPlusWeigth)
        tvWeigth = findViewById(R.id.tvWeigth)
        btnSubtractAge = findViewById(R.id.btnSubtractAge)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        tvAge = findViewById(R.id.tvAge)
        btnCalculate = findViewById(R.id.btnCalculate)
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        rsHeigth.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            currentHeigth = df.format(value).toInt()
            tvHeigth.text = "$currentHeigth cm"
        }
        btnSubtractWeigth.setOnClickListener {
            currentWeigth -= 1
            setWeigth()
        }
        btnPlusWeigth.setOnClickListener {
            currentWeigth += 1
            setWeigth()
        }
        btnSubtractAge.setOnClickListener {
            currentAge -= 1
            setAge()
        }
        btnPlusAge.setOnClickListener {
            currentAge += 1
            setAge()
        }
        btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result)
        }
    }

    private fun navigateToResult(result: Double) {
        val intent = Intent(this, ResultIMCActivity::class.java)
        intent.putExtra(IMC_KEY, result)
        startActivity(intent)
    }

    private fun calculateIMC(): Double {
        val df = DecimalFormat("#.##")
        val imc = currentWeigth / (currentHeigth.toDouble()/100 * currentHeigth.toDouble()/100)
        return df.format(imc).replace(",", ".").toDouble()
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor() {
        viewMale.setBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {

        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }

        return ContextCompat.getColor(this, colorReference)
    }

    private fun setWeigth() {
        tvWeigth.text = currentWeigth.toString()
    }

    private fun setAge() {
        tvAge.text = currentAge.toString()
    }

    private fun initUI() {
        setGenderColor()
        setWeigth()
        setAge()
    }

}
