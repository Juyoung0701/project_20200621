package kr.co.namu.project_20200621

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third2.*

class ThirdActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third2)

//        들어올때 message 라는 이름이 적힌 String 있는지 확인 => 결과를 변수에 저
        val receivedMessage = intent.getStringExtra("message")

        messageTxt.text = receivedMessage
    }



}