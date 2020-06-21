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
            val myIntent = Intent(this, EditNickNameActivity::class.java)
//            결과를 가지러 가는 이동은 startActivityForResult로 가야함
//            이런 방식의 이동은 어떤결과를 가지러(닉네임/비번 등) 가는지 숫자로 구별해야함. EX. 닉네임 -> 1000번
            startActivityForResult(myIntent, 1000)
        }



    }
}