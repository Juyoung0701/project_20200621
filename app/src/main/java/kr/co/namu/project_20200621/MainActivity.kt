package kr.co.namu.project_20200621

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstActivityBtn.setOnClickListener {


            val myIntent = Intent(this, FirstActivity2::class.java)

            startActivity(myIntent)
        }
    }
}