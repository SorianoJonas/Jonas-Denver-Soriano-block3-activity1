package soriano.jonasdenver.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var tv_text: TextView

    val phrases = arrayOf(
        "pogi",
        "handsome",
        "sheesh",
        "miss na kita balik kana",
        "HAHAHAHAHA",
        "Iloveyou"
    )

    lateinit var random: Random
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        random = Random

        tv_text = findViewById(R.id.tv_text)

        tv_text.setOnClickListener{
            tv_text.text = phrases[random.nex]

        }

    }
}
