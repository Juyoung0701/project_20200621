package kr.co.namu.project_20200621

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first2.*

class FirstActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first2)





        closeBtn.setOnClickListener {

            finish()
//            val myIntent = Intent(this, MainActivity::class.java)

//            startActivity(myIntent)
        }
    }
}