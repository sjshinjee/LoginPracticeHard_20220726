package com.homee.loginpracticehard_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()
//논리 연산자(&&)를 활용해서 id와 pw를 한번에 분기처리
            if(inputId == "admin" && inputPw == "asdf"){
                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "로그인에 실패하셨습니다", Toast.LENGTH_SHORT).show()
            }


        }
    }
}