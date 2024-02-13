package com.example.pinchgesture_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.widget.ImageView
import kotlin.math.max
import kotlin.math.min

@SuppressLint("StaticFieldLeak")
lateinit var iv: ImageView
var scale = 1f
class MainActivity : AppCompatActivity() {

    private var ourSD: ScaleGestureDetector? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv = findViewById(R.id.image)
        ourSD = ScaleGestureDetector(this, ScaleListener())

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        ourSD!!.onTouchEvent(event!!)
        return super.onTouchEvent(event)
    }
    class ScaleListener: ScaleGestureDetector.SimpleOnScaleGestureListener(){
        override fun onScale(detector: ScaleGestureDetector): Boolean {
            scale += detector.scaleFactor
            scale = max(0.1f, min(scale, 5.0f))
            iv.scaleX = scale
            iv.scaleY = scale

            return true
        }
    }

}