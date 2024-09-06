package ft.etachott.swifty_companions

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.Slider

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the slider and text view by their IDs
        val slider: Slider = findViewById(R.id.volume_slider)
        val sliderValueText: TextView = findViewById(R.id.less_generic_name)

        // Set an initial text to display the default slider value
        sliderValueText.text = "Current value: ${slider.value.toInt()}"

        // Listen for slider value changes
        slider.addOnChangeListener { _, value, _ ->
            // Update the text when the slider value changes
            sliderValueText.text = "Current value: ${value.toInt()}"
        }


    }
}