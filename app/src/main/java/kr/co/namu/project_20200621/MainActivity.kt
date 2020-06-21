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



        secondActivityBtn.setOnClickListener {
            val myIntent = Intent(this, SecondActivity2::class.java)
            startActivity(myIntent)
        }

        thirdActivityBtn.setOnClickListener {
            val inputMessage = messageEdt.text.toString()

            val myIntent = Intent(this, ThirdActivity2::class.java)
            myIntent.putExtra("message", inputMessage)
            startActivity(myIntent)
        }

        setNickNameBtn.setOnClickListener {
            val MyIntent = Intent(this, EditNickNameActivity::class.java)
            startActivity(MyIntent)
        }



    }
}