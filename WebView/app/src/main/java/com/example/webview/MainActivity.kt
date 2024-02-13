package com.example.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetup()

    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup() {
        var webView = findViewById<WebView>(R.id.wb_webView)
            webView.webViewClient = WebViewClient()
        webView.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled = true
        }

    }

}