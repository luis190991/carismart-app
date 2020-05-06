package mx.uach.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class CitySelectorActivity : AppCompatActivity() {

    val TAG = "CITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_selector)

        val btnCuu = findViewById<Button>(R.id.btnCuu)
        btnCuu.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Chihuahua", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "Chihuahua")
            startActivity(intent)
        })

        val btnMty= findViewById<Button>(R.id.btnMty)
        btnMty.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Monterrey", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "Monterrey")
            startActivity(intent)
        })
    }
}
