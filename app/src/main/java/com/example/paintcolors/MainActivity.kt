package com.example.paintcolors

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintcolors.PaintView.Companion.currentBrush

class MainActivity : AppCompatActivity() {
    companion object{
        var path = Path()
        var paintBrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redcolor)
        val greenBtn = findViewById<ImageButton>(R.id.greencolor)
        val blueBtn = findViewById<ImageButton>(R.id.bluecolor)

        redBtn.setOnClickListener{
            Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        greenBtn.setOnClickListener{
            Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener{
            Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}