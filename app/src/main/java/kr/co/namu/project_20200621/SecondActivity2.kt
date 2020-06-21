package kr.co.namu.project_20200621

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first2.*
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)


        closeBtnSecond.setOnClickListener {

            finish()
        }
    }
}