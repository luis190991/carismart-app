package mx.uach.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ciudad = intent.getStringExtra("CITY")
        val txtVw = findViewById<TextView>(R.id.txtVwCity)
        txtVw.text = ciudad
    }
}
