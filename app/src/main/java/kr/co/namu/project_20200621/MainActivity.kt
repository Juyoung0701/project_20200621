package kr.co.namu.project_20200621

import android.app.Activity
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
//어떤 종류가 되었든, 결과를 가지고 돌오올때 실행되는 함수.

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


//        이 함수가 실행된 이유 (어떤 요청?) => 1000번 이었는지? => 닉네임 변경을 위해 다녀온건지?

        if (requestCode == 1000) {


//            확인을 누른게 맞는지? => 취소를 한게 아닌지?

            if (resultCode == Activity.RESULT_OK) {

//                닉변 화면에서 첨부해준 newNickName 스트링 값을 저장.

                val newNick = data?.getStringExtra("newNickName")


//                받아온 닉네임을 텍스트뷰에 표시

                nickNameTxt.text = newNick

            }
        }


    }

}