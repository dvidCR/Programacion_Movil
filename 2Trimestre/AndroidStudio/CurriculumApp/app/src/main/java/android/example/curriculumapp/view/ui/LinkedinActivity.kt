package android.example.curriculumapp.view.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LinkedinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.linkedin.com/in/david-casado-rodr%C3%ADguez-30a168262/")
        startActivity(intent)

        finish()
    }
}