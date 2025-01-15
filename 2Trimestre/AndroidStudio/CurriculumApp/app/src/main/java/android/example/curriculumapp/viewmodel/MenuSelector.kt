package android.example.curriculumapp.viewmodel

import android.content.Intent
import android.example.curriculumapp.view.ui.AboutActivity
import android.example.curriculumapp.view.ui.CVActivity
import android.example.curriculumapp.view.ui.CartaPresentacionActivity
import android.example.curriculumapp.view.ui.LinkedinActivity
import android.example.curriculumapp.R
import android.example.curriculumapp.view.ui.WebActivity
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class MenuSelector : AppCompatActivity() {

    companion object {
        var actividadActual = 0
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bar_menu, menu)
        updateMenuItems(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.cv -> navigateTo(CVActivity::class.java, 0)
            R.id.carta -> navigateTo(CartaPresentacionActivity::class.java, 1)
            R.id.linkedin -> navigateTo(LinkedinActivity::class.java, 2)
            R.id.web -> navigateTo(WebActivity::class.java, 3)
            R.id.about -> navigateTo(AboutActivity::class.java, 4)
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

    private fun updateMenuItems(menu: Menu) {
        // Disable the current activity's menu item
        for (i in 0 until menu.size()) {
            menu.getItem(i).isEnabled = i != actividadActual
        }
    }

    private fun navigateTo(targetActivity: Class<*>, currentActivityIndex: Int) {
        actividadActual = currentActivityIndex
        val intent = Intent(this, targetActivity)
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
        startActivity(intent)
    }
}