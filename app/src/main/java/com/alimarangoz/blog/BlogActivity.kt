package com.alimarangoz.blog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebView

class BlogActivity : AppCompatActivity() {

    lateinit var webView : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        webView = findViewById(R.id.web_view)
        webView.loadUrl("https://alimarangoz.github.io/My-Site/")

        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)



    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}