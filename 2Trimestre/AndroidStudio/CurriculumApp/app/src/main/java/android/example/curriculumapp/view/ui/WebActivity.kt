package android.example.curriculumapp.view.ui

import android.example.curriculumapp.R
import android.example.curriculumapp.viewmodel.MenuSelector
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : MenuSelector() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val webView: WebView = findViewById(R.id.web)

        webView.webViewClient = object : WebViewClient() {
            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                super.onReceivedError(view, errorCode, description, failingUrl)
                println("Error cargando la página: $description")
            }
        }

        webView.loadUrl("file:///android_asset/HTML/Curriculo.html")
    }
}
