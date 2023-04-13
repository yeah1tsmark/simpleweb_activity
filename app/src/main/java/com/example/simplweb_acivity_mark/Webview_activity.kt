package com.example.simplweb_acivity_mark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Webview_activity : AppCompatActivity() {

    lateinit var thisweb:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        thisweb = findViewById(R.id.myweb)

        val webSettings = thisweb.settings
        webSettings.javaScriptEnabled = true
        thisweb.loadUrl("https://ke.kcbgroup.com")
















    }
}