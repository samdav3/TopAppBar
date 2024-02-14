package com.example.gestures_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Button
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    var gDectector: GestureDetectorCompat? = null
    lateinit var getGestureText: TextView
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var textView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView = findViewById(R.id.textView3)
        button2 = findViewById(R.id.button2)
        button = findViewById(R.id.button)
        getGestureText = findViewById(R.id.getGestureText)
        this.gDectector = GestureDetectorCompat(this, this)
        gDectector?.setOnDoubleTapListener(this)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDectector?.onTouchEvent(event!!)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent): Boolean {
        getGestureText.text = "Boo!"
        return true
    }

    override fun onShowPress(e: MotionEvent) {

    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {

        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {

        return true
    }

    override fun onLongPress(e: MotionEvent) {

    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {

        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        button.setOnClickListener {
            textView.text = "Scared ya!"
        }
        return true
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        button2.setOnClickListener{
            val intent = Intent (this, MainActivity3::class.java)
            startActivity(intent)
        }
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {

        return true
    }


}


